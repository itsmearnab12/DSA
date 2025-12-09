import java.util.Scanner;

public class Problem16 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.print("Enter the number: ");
        int n = scn.nextInt();
        int ans1 = sqrt(n);
        System.out.print("Square root of given number is: "+ans1);
    }

    public static int sqrt(int n) {
        int ans = 1;
        int i = 1;
        while (i * i <= n) {
            ans = i;
            i++;
        }
        return ans;
    }
}
