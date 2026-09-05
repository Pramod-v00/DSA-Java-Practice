class Solution {
    public String reversePrefix(String word, char ch) {
        String ans=String.valueOf(ch);
        int i=0;
        while(i<word.length() && word.charAt(i)!=ch){
            i++;
        }
        if(i<word.length()){
        ans+=new StringBuilder(word.substring(0,i)).reverse().toString();
        ans+=word.substring(i+1,word.length());
        }else return word;
        return ans;
    }
}