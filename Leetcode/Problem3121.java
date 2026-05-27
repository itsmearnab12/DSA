import java.util.*;

public class Problem3121 {
    public int numberOfSpecialChars(String word) {

        int[] lastLower = new int[26];
        int[] firstUpper = new int[26];

        // initialize arrays
        Arrays.fill(lastLower, -1);
        Arrays.fill(firstUpper, Integer.MAX_VALUE);

        // traverse string
        for (int i = 0; i < word.length(); i++) {

            char ch = word.charAt(i);

            // lowercase
            if (ch >= 'a' && ch <= 'z') {
                int index = ch - 'a';
                lastLower[index] = i;
            }

            // uppercase
            else {
                int index = ch - 'A';

                // store first uppercase position only
                firstUpper[index] = Math.min(firstUpper[index], i);
            }
        }

        int count = 0;

        // check all characters
        for (int i = 0; i < 26; i++) {

            // both lowercase and uppercase exist
            if (lastLower[i] != -1 &&
                firstUpper[i] != Integer.MAX_VALUE &&
                lastLower[i] < firstUpper[i]) {

                count++;
            }
        }

        return count;
    }
}