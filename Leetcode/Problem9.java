import java.util.*;

public class Problem9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int x = sc.nextInt();

        Solution obj = new Solution();

        boolean result = obj.isPalindrome(x);

        System.out.println(result);
    }
}

class Solution {
    public boolean isPalindrome(int x) {

        if (x < 0) return false;

        int original = x;
        int reversed = 0;

        while (x > 0) {
            int digit = x % 10;
            reversed = reversed * 10 + digit;
            x = x / 10;
        }

        return original == reversed;
    }
}
