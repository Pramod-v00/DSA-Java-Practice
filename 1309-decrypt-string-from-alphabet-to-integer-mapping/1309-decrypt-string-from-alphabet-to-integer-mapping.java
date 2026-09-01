class Solution {
    public String freqAlphabets(String s) {
        int i = s.length()-1;
        StringBuilder res = new StringBuilder();
        while(i>=0)
        {
            if(s.charAt(i)=='#')
            {
                int num = (s.charAt(i-2)-'0')*10 + (s.charAt(i-1)-'0');
                res.append((char) (96+num));
                i-=3;
            }
            else
            {
                int num = s.charAt(i)-'0';
                res.append((char) (96+num));
                i--;
            }
        }
        return res.reverse().toString();
    }
}