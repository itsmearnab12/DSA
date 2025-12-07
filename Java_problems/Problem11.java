import java.util.Scanner;
class Problem11 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.print("Enter the value for n factorial: ");
        int n = scn.nextInt();
        System.out.print("Enter the value for r factorial: ");
        int r = scn.nextInt();
        int ans = fact(n , r);
        System.out.print("The factorial is: "+ans);
    }
    public static int fact(int n, int r){
        int ans1 = 1;
        for(int i = 1; i <= n; i++){
            ans1 = ans1*i;
        }
    
        int ans2 = 1;
        for(int i = 1; i <= r; i++){
            ans2 = ans2*i;
        }
    
        int ans3 = 1;
        for(int i = 1; i <= n-r; i++){
            ans3 = ans3*i;
        }

        return ans1/(ans2*ans3);
    }
}
