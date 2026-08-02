class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
        int count=1,max=0,co1=0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]==1){
                co1++;
                if((i-1)>=0 && nums[i-1]==nums[i]) count++;
            }else{
                count=1;
            }
            max=Math.max(max,count);
        }
        if(co1==0) return 0;
        return max;
    }
}