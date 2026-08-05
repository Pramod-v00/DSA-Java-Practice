class Solution {
    public int smallestNumber(int n) {
        int cnt=1;
        while(n!=0){
            cnt<<=1 | 1;
            n>>=1;
        }
        return cnt-1;
    }
}