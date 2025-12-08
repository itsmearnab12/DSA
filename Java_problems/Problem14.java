//Finding the factorial of a number
import java.util.Scanner;
public class Problem14 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.print("Enter the factorial: ");
        int n = scn.nextInt();
        int count = 0;
        for(int i=1; i*i<=n; i++){
            if(n%i==0){
                if(i==n/i){
                    count = count + 1;
                }else{
                    count = count + 2;
                }
            }
        }
        System.out.print("The total count of the factorial is: "+ count);
    }
}
