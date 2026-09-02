class Solution {
    public String convertToTitle(int columnNumber) {
        StringBuilder str=new StringBuilder();
        int ans=columnNumber,a=columnNumber;
        while(ans>0){
            ans--;
            str.append((char)('A'+(ans%26)));
            ans=ans/26;
        }
        return str.reverse().toString();
    }
}