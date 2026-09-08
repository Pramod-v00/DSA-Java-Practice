class Solution {
    public int repeatedStringMatch(String a, String b) {
        StringBuilder sb = new StringBuilder(a);
        int cnt = 1;
        while(sb.length() < b.length()) {
            sb.append(a);
            cnt++;
        }
        if(sb.indexOf(b) != -1)
            return cnt;

        sb.append(a);
        cnt++;

        if(sb.indexOf(b) != -1)
            return cnt;
    return -1;
    }
}