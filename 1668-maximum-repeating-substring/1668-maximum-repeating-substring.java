class Solution {
    public int maxRepeating(String sequence, String word) {

        int ans = 0;

        for (int i = 0; i < sequence.length(); i++) {

            int pos = i;
            int cnt = 0;

            while (pos + word.length() <= sequence.length()) {

                int j = 0;

                // Check whether word matches starting at pos
                while (j < word.length()) {

                    if (sequence.charAt(pos + j) != word.charAt(j)) {
                        break;
                    }

                    j++;
                }

                // Complete word matched
                if (j == word.length()) {
                    cnt++;
                    pos += word.length();
                } else {
                    break;
                }
            }

            ans = Math.max(ans, cnt);
        }

        return ans;
    }
}