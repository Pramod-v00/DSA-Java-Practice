class Solution {
    public String longestCommonPrefix(String[] strs) {
        String ans="";
        for(int i=0;i<strs[0].length();i++){
            char ch=strs[0].charAt(i);
            int j=0;
          for(j=0;j<strs.length;j++){
            if(i<strs[j].length()){
                if(ch!=strs[j].charAt(i)){
                    break;
                }
            }else break;
          }
          if(j==strs.length) ans+=ch;
          else break;  
        }
        return ans;
    }
}