import java.util.Scanner;;
class Problem7 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.print("Enter the number: ");
        int n = scn.nextInt();
        int ans = 1;
        for(int i = 1; i <= n; i++){
            ans = ans*i;
        }
        System.out.print("The factorial of given number is: " + ans);
    }
}
