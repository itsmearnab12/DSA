//Creating an array by taking the size from user and printing the length of array
import java.util.Scanner;
public class problem17 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.println("Enter the number: ");
        int n = scn.nextInt();
        int [] arr = new int[n];
        for(int i = 0; i < n; i++){
            arr[i] = scn.nextInt();
        }
        System.out.println(arr.length);
    }
}
