class Problem1340 {

    public int maxJumps(int[] arr, int d) {

        int n = arr.length;

        // dp[i] stores answer for index i
        int[] dp = new int[n];

        int ans = 1;

        for (int i = 0; i < n; i++) {
            ans = Math.max(ans, jump(i, arr, d, dp));
        }

        return ans;
    }

    public int jump(int i, int[] arr, int d, int[] dp) {

        // already calculated
        if (dp[i] != 0) {
            return dp[i];
        }

        int max = 1;

        // CHECK RIGHT
        for (int step = 1; step <= d; step++) {

            int j = i + step;

            if (j >= arr.length) {
                break;
            }

            if (arr[j] >= arr[i]) {
                break;
            }

            max = Math.max(max, 1 + jump(j, arr, d, dp));
        }

        // CHECK LEFT
        for (int step = 1; step <= d; step++) {

            int j = i - step;

            if (j < 0) {
                break;
            }

            if (arr[j] >= arr[i]) {
                break;
            }

            max = Math.max(max, 1 + jump(j, arr, d, dp));
        }

        // store answer
        dp[i] = max;

        return max;
    }
}