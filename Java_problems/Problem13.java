import java.util.Scanner;
class Problem13 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.print("Enter the factorial: ");
        int n = scn.nextInt();
        int count = 0;
        for(int i = 1; i <= n; i++){
            if (n%i==0) {
                count++;
            }
        }
        System.out.print("The total count of the factorial is: "+count);
    }
}
