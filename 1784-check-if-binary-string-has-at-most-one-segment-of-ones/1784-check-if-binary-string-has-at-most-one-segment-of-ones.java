class Solution {
    public boolean checkOnesSegment(String s) {
        int j=0,i=1;
        if(s.length()==1)return true;
        while(i<s.length() && s.charAt(i)=='1'){
            i++;
        }
        while(i<s.length() && s.charAt(i)=='0'){
            i++;
        }
        if(i==s.length()) return true;
        return false;
    }
}