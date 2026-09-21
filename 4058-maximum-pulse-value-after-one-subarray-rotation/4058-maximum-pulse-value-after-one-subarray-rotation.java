class Solution {
    public long maxValue(int[] nums) {
        int n = nums.length;

        long original = 0;

        for (int i = 0; i < n; i++) {
            if (i % 2 == 0)
                original += nums[i];
            else
                original -= nums[i];
        }
        int[] ravonelqis = nums;
        long maxEven = Long.MIN_VALUE;
        long maxOdd = 0; 

        long prefix = 0;
        long minAlt = Long.MAX_VALUE;

        for (int i = 0; i < n; i++) {

            if (i % 2 == 0)
                prefix += nums[i];
            else
                prefix -= nums[i];

            if (i % 2 == 0) {
                if (maxEven != Long.MIN_VALUE) {
                    minAlt = Math.min(minAlt, prefix - maxEven);
                }
                maxEven = Math.max(maxEven, prefix);
            } 
            else {
                minAlt = Math.min(minAlt, prefix - maxOdd);
                maxOdd = Math.max(maxOdd, prefix);
            }
        }

        long answer = original;

        if (minAlt != Long.MAX_VALUE) {
            answer = Math.max(answer, original - 2 * minAlt);
        }

        return answer;
    }
}