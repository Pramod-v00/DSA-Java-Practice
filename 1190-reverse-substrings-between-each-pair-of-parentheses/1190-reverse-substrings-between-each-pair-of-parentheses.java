class Solution {
    public String reverseParentheses(String s) {
        StringBuilder sb=new StringBuilder();
        Stack<String> st =new Stack<>();
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)=='('){
                st.push(sb.toString());
                sb=new StringBuilder();
            }else if(s.charAt(i)==')'){
                String temp=sb.reverse().toString();
                String prev="";
                if(!st.isEmpty())
                prev=st.pop();
                sb=new StringBuilder(prev+temp);
            }
            else{
                sb.append(String.valueOf(s.charAt(i)));
            }
        }
        return sb.toString();
    }
}