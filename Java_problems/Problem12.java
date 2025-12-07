//Another way to find the factorial value of nCr
import java.util.Scanner;
class Problem12 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.print("Enter the value for n factorial: ");
        int n = scn.nextInt();
        System.out.print("Enter the value for r factorial: ");
        int r = scn.nextInt();
        int ans1 = fact(n);
        int ans2 = fact(r);
        int ans3 = fact(n-r);
        int ans = ans1/(ans2*ans3);
        System.out.print("The factorial is: "+ans);
    }
    public static int fact(int x){
        int ans1 = 1;
        for(int i = 1; i <= x; i++){
            ans1 = ans1*i;
        }
        return ans1;
    }
}
