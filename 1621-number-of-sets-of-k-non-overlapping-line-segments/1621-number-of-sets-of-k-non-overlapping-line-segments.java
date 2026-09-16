class Solution {
    public int numberOfSets(int n, int k) {

        int MOD = 1000000007;

        int maxN = n + k - 1;
        int maxK = 2 * k;

        long[][] dp = new long[maxN + 1][maxK + 1];

        // C(i, 0) = 1
        for (int i = 0; i <= maxN; i++) {
            dp[i][0] = 1;
        }

        for (int i = 1; i <= maxN; i++) {

            for (int j = 1; j <= Math.min(i, maxK); j++) {

                dp[i][j] =
                    (dp[i - 1][j - 1] + dp[i - 1][j]) % MOD;
            }
        }

        return (int) dp[maxN][maxK];
    }
}