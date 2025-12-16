//Creating an array by taking the size from user and printing the value of array
import java.util.Scanner;
public class Problem18 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.print("Enter the size of array: ");
        int n = scn.nextInt();
        int [] arr = new int[n];
        for(int i = 0; i < n; i++){
            arr[i] = scn.nextInt();
        }
        for(int i = 0; i < n; i++){
            System.out.println("The value of the array are: "+arr[i]);
        }
    }
}
