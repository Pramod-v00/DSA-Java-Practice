class Solution {
    public boolean canTransform(String start, String result) {
        int i=0,j=0;
        while(i<start.length() && j<result.length()){
            if(start.charAt(i)=='X'){
                i++;
                continue;
            }
            if(result.charAt(j)=='X'){
                j++;
                continue;
            }
            if(start.charAt(i)==result.charAt(j)){
                if(start.charAt(i)=='L' && i < j)
                    return false;
                if(start.charAt(i)=='R' && i > j)
                    return false;
                i++;
                j++;
                continue;
            }else return false;
        }
        while(i<start.length() && start.charAt(i)=='X')i++;
        while(j<result.length() && result.charAt(j)=='X')j++;
        return i==j;
    }
}