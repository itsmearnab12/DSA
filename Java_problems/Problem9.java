import java.util.Scanner;

class Problem9 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.print("Enter the value of n: ");
        int n = scn.nextInt();
        int n1 = fact(n);
        System.out.print("The factorial value is :"+n1);
    }

    public static int fact(int n) {
        int ans = 1;
        for (int i = 1; i <= n; i++) {
            ans = ans * i;
        }
        return ans;
    }

}
