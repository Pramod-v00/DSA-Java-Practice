class Solution {
    public int numWays(String s) {
        int cnt=0,n=s.length();
        for(char c:s.toCharArray()){
            if(c=='1') cnt++;
        }
        if(cnt%3!=0) return 0;
        else if(cnt==0) return (int)((long)(n-1)*(n-2)/2 % 1000000007);
        int per=cnt/3,j=0;
        j=ocheck(s,j,per);
        int f= zcheck(s,j);
        j += f;
        j=ocheck(s,j,per);
        int sec=zcheck(s,j);
        return (int)((long)(f+1)*(sec+1) % 1000000007);
        }
    int ocheck(String s,int j,int per){
        int ocnt=0;
        while(j<s.length() && ocnt<per ){
            if(s.charAt(j)=='1')
            ocnt++;
            j++;
        }
        return j;
    }
    int zcheck(String s,int j){
        int zcnt=0;
        while(j<s.length() && s.charAt(j)=='0'){
                zcnt++;
                j++;
        }
        return zcnt;
    }
}