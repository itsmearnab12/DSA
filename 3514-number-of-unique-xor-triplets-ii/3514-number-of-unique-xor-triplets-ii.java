class Solution {
    public int uniqueXorTriplets(int[] nums) {
        final int MAX = 2048;

        boolean[] one = new boolean[MAX];
        boolean[] two = new boolean[MAX];
        boolean[] three = new boolean[MAX];

        for (int num : nums) {

            // Build triplets
            boolean[] nextThree = three.clone();
            for (int x = 0; x < MAX; x++) {
                if (two[x]) nextThree[x ^ num] = true;
            }

            // Build pairs
            boolean[] nextTwo = two.clone();
            for (int x = 0; x < MAX; x++) {
                if (one[x]) nextTwo[x ^ num] = true;
            }

            nextThree[num] = true; // (i,i,i)

            one[num] = true;
            two = nextTwo;
            three = nextThree;
        }

        int ans = 0;
        for (boolean b : three)
            if (b) ans++;

        return ans;
    }
}