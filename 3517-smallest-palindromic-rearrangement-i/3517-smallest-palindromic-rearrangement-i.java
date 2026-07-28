class Solution {
    public String smallestPalindrome(String s) {
        int[] freq = new int[26];

        for (char ch : s.toCharArray()) {
            freq[ch - 'a']++;
        }

        StringBuilder half = new StringBuilder();
        String middle = "";

        for (int i = 0; i < 26; i++) {
            if (freq[i] % 2 == 1) {
                middle = String.valueOf((char) ('a' + i));
            }

            for (int j = 0; j < freq[i] / 2; j++) {
                half.append((char) ('a' + i));
            }
        }

        StringBuilder ans = new StringBuilder();
        ans.append(half);
        ans.append(middle);
        ans.append(new StringBuilder(half).reverse());

        return ans.toString();
    }
}