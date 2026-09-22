class Solution {
    public int reverseDegree(String s) {
        int[] temp=new int[26];
        for(int i=0;i<26;i++){
            temp[i]=26-i;
        }
        int ans=0;
        for(int i=0;i<s.length();i++){
            ans+=((temp[s.charAt(i)-'a'])*(i+1));
        }
        return ans;
    }
}