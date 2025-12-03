import java.util.Scanner;
class Problem8 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.print("Enter the value for n factorial: ");
        int n = scn.nextInt();
        System.out.print("Enter the value for r factorial: ");
        int r = scn.nextInt();

        //First loop calculating the factorial of n
        int ans1 = 1;
        for(int i = 1; i <= n; i++){
            ans1 = ans1*i;
        }
        //Second loop calculating the factorial of r
        int ans2 = 1;
        for(int i = 1; i <= r; i++){
            ans2 = ans2*i;
        }
        //Third loop calculating the factorial of n-r
        int ans3 = 1;
        for(int i = 1; i <= n-r; i++){
            ans3 = ans3*i;
        }
        int ans = ans1/(ans2*ans3);
        System.out.print("The factorial value is: "+ans);
    }
}
