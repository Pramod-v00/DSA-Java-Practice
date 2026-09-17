class Solution {
    public String shiftingLetters(String s, int[] shifts) {
        StringBuilder sb=new StringBuilder(s);
        long sum=0;
        for(int i=0;i<shifts.length;i++){
            sum+=shifts[i];
        }
        for(int i=0;i<shifts.length;i++){
            char temp=(char)((sb.charAt(i) - 'a' + sum) % 26 + 'a');
            sb.setCharAt(i,temp);
            sum-=shifts[i];
        }
        return sb.toString();
    }
}