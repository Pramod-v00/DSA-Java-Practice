class Solution {
    public int minOperations(int[] nums, int x) {
        int total=0,tar=0,sum=0;
        for(int num:nums){
            total+=num;
        }
        tar=total-x;
        int l=0,r=0,maxl=-1;
        if(tar<0) return -1;
        for(r=0;r<nums.length;r++){
            sum+=nums[r];
            while(sum>tar && l<=r){
                sum-=nums[l];
                l++;
            }
            if(sum==tar) maxl=Math.max(maxl,r-l+1);
        }
        if(maxl==-1) return -1;
        return nums.length-maxl;
    }
}