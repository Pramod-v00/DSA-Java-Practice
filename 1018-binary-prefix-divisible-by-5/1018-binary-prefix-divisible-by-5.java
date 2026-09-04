class Solution {
    public List<Boolean> prefixesDivBy5(int[] nums) {
        List<Boolean> ans=new ArrayList<>();
        long a=0;
        for(int i:nums){
            a=(a*2+i)%5;
            if(a==0) ans.add(true);
            else ans.add(false);
        }
        return ans;
    }
}