class Solution {
    public int smallestIndex(int[] nums) {
        int ans=0;
        for(int i=0;i<nums.length;i++){
            if(check(nums[i],i)) return i;
        }
        return -1;
    }
    boolean check(int n,int i){
        int ans=0;
        while(n!=0){
            ans+=n%10;
            n/=10;
        }
        return ans==i;
    }
}