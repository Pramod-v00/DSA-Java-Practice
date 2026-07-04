class Solution {
    public boolean isPossibleToSplit(int[] nums) {
        int[] res=new int[101];
        for(int i=0;i<nums.length;i++){
            res[nums[i]]++;
        }
        for(int i=0;i<nums.length;i++){
            if(res[nums[i]]>2){
                return false;
            }
        }
        return true;
    }
}