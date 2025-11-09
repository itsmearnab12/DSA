import java.util.Scanner;

class Problem1 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.print("Enter Your Age: ");
        int age = scn.nextInt();
        if (age > 18) {
            System.out.println("Your are eligible to drive");
        } else {
            System.out.println("Your are not eligible to drive");
        }
    }
}