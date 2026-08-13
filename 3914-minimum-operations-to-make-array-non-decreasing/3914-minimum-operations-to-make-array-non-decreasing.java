class Solution {
    public long minOperations(int[] nums) {
        long res=0;
        for(int i=1;i<nums.length;i++){
            res+=Math.max((nums[i-1]-nums[i]),0);
        }
        return res;
    }
}