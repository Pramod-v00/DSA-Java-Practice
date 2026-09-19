class Solution {
    public int countHomogenous(String s) {
        long n=s.length(),res=0,cnt=0;
        for(int i=0;i<n;i++){
            if(i>0 && s.charAt(i)==s.charAt(i-1)){
                cnt++;
            }else{
                cnt=1;
            }
            res+=cnt;
        }
        return (int)(res%1000000007);
    }
}