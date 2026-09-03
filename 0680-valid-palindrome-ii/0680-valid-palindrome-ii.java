class Solution {
    public boolean validPalindrome(String s) {
        int i=0,j=s.length()-1,cnt=0;
        while(i<j){
            if(s.charAt(i)==s.charAt(j)){
                i++;
                j--;
            }else{
                return check(s,i+1,j) || check(s,i,j-1);
            }
            
        }
        return true;
    }
    boolean check(String s,int left,int right){
        while(left < right) {
            if(s.charAt(left) != s.charAt(right)) {
                return false;
            }
            left++;
            right--;
        }
        return true;
    }
}