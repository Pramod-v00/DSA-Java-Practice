class Solution {
    public boolean canReach(String s, int minJump, int maxJump) {

        int n = s.length();

        boolean[] reachable = new boolean[n];
        reachable[0] = true;

        int count = 0;

        for (int i = 1; i < n; i++) {

            // Add the new position entering our window
            int add = i - minJump;

            if (add >= 0 && reachable[add]) {
                count++;
            }

            // Remove the position leaving our window
            int remove = i - maxJump - 1;

            if (remove >= 0 && reachable[remove]) {
                count--;
            }

            // i is reachable if:
            // 1. it is '0'
            // 2. there is at least one reachable position
            //    in the valid jump range
            if (s.charAt(i) == '0' && count > 0) {
                reachable[i] = true;
            }
        }

        return reachable[n - 1];
    }
}