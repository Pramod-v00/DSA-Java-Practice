class Solution {
    public int smallestNumber(int n, int t) {
        int ans=1,temp=n;
        while(ans%t!=0){
            ans=1;
            while(n!=0){
            ans*=n%10;
            n/=10;
            }
            if(ans%t==0){
                return temp;
            }
            n=temp+1;
            temp=n;
        }
        return temp;
    }
}