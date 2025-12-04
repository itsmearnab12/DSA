//Finding the addition of two numbers using function
import java.util.Scanner;
class Problem10 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.print("Enter the value of a :");
        int a = scn.nextInt();
        System.out.print("Enter the value of b :");
        int b = scn.nextInt();
        int ans = sum(a, b);
        System.out.print("The addition of both the values is :"+ans);
    }

    public static int sum(int a, int b){
        return a+b;
    }
}
