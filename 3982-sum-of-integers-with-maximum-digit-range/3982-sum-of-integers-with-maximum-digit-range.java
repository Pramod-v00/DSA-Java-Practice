class Solution {
    public int maxDigitRange(int[] nums) {
        int[] temp=new int[nums.length];
        int res=0;
        for(int i=0;i<nums.length;i++){
            int t=nums[i],max=0,min=Integer.MAX_VALUE;
            while(t!=0){
                int a=t%10;
                max=Math.max(max,a);
                min=Math.min(min,a);
                t/=10;
            }
            temp[i]=max-min;
        }
        int maximum=0;
        for(int i=0;i<nums.length;i++){
            maximum=Math.max(maximum,temp[i]);
        }
        for(int i=0;i<nums.length;i++){
            if(maximum==temp[i]){
                res+=nums[i];
            }
        }
        return res;
    }
}