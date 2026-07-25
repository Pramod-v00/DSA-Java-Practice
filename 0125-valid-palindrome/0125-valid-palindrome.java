class Solution {
    public boolean isPalindrome(String s) {
        String a="";
        String b="";
        for(int i=0;i<s.length();i++){
            if((s.charAt(i)>='a' && s.charAt(i)<='z') || (s.charAt(i)>='A' && s.charAt(i)<='Z') || (s.charAt(i) >= '0' && s.charAt(i) <= '9')){
                a=a+s.charAt(i);
            }
        }
        a=a.toLowerCase();
        for(int i=a.length()-1;i>=0;i--){
            b+=a.charAt(i);
        }
        if(a.equals(b)){
            return true;
        }
        return false;
    }
}