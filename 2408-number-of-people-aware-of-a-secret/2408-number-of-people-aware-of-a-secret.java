class Solution {
    private static final int MOD = 1_000_000_007;

    public int peopleAwareOfSecret(int n, int delay, int forget) {
        long[] dp = new long[n + 1];  // dp[i] = number of new people who learn the secret on day i
        dp[1] = 1;

        long peopleSharing = 0;
        for (int day = 2; day <= n; day++) {
            // People who start sharing today
            if (day - delay >= 1) {
                peopleSharing = (peopleSharing + dp[day - delay]) % MOD;
            }
            // People who forget today
            if (day - forget >= 1) {
                peopleSharing = (peopleSharing - dp[day - forget] + MOD) % MOD;
            }
            // Today’s new people
            dp[day] = peopleSharing;
        }

        long total = 0;
        for (int day = n - forget + 1; day <= n; day++) {
            total = (total + dp[day]) % MOD;
        }
        return (int) total;
    }
}
