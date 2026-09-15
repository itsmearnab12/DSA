class Solution {
    public int maxPalindromes(String s, int k) {

        int n = s.length();
        int ans = 0;
        int end = -1;

        for (int i = 0; i < n; i++) {

            // If k is odd, check odd palindrome first
            // If k is even, check even palindrome first

            if (k % 2 == 1) {

                // Odd length palindrome
                int l = i;
                int r = i;

                while (l >= 0 && r < n && s.charAt(l) == s.charAt(r)) {

                    if (r - l + 1 >= k && l > end) {
                        ans++;
                        end = r;
                        break;
                    }

                    l--;
                    r++;
                }

                // Even length palindrome
                l = i - 1;
                r = i;

                while (l >= 0 && r < n && s.charAt(l) == s.charAt(r)) {

                    if (r - l + 1 >= k && l > end) {
                        ans++;
                        end = r;
                        break;
                    }

                    l--;
                    r++;
                }

            } else {

                // Even length palindrome FIRST
                int l = i - 1;
                int r = i;

                while (l >= 0 && r < n && s.charAt(l) == s.charAt(r)) {

                    if (r - l + 1 >= k && l > end) {
                        ans++;
                        end = r;
                        break;
                    }

                    l--;
                    r++;
                }

                // Odd length palindrome
                l = i;
                r = i;

                while (l >= 0 && r < n && s.charAt(l) == s.charAt(r)) {

                    if (r - l + 1 >= k && l > end) {
                        ans++;
                        end = r;
                        break;
                    }

                    l--;
                    r++;
                }
            }
        }

        return ans;
    }
}