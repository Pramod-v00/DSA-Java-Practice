class Solution {
    public int gcdOfOddEvenSums(int n) {
        int oddcount=-1,evencount=0;
        int sumodd=0,sumeven=0;
        int i=0;
        while(i<n){
            oddcount=oddcount+2;
            evencount=evencount+2;
            i++;
            sumodd+=oddcount;
            sumeven+=evencount;
        }
        return gcd(sumodd,sumeven);
    }
    int gcd(int a,int b){
        if(b==0) return a;
        return gcd(b,a%b);
    }
}