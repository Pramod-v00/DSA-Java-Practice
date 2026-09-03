class Solution {
    public boolean isLongPressedName(String name, String typed) {
        int i=0,j=0;
        if(name.length()>typed.length()) return false;
        while(i<name.length() && j<typed.length()){
            if(name.charAt(i)!=typed.charAt(j)){
                if(j>0 && i>0 && typed.charAt(j-1)==typed.charAt(j) &&
                typed.charAt(j)==name.charAt(i-1)){
                    j++;
                    continue;
                }else{
                    return false;
                }
            }
            i++;
            j++;
        }
        while(j<typed.length()){
            if(typed.charAt(j-1)==typed.charAt(j)) j++;
            else return false;
        }
        if(j<typed.length()){
            return false;
        } 
        if(i<name.length()){
            return false;
        } 
        return true;
    }
}