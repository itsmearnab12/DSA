import java.util.Scanner;
public class Problem19 {
    public static void main(String[] args) {
        //Creating scanner class to take user input
        Scanner scn = new Scanner(System.in);
        System.out.print("Enter the size of array: ");
        int n = scn.nextInt();

        //Creating array and storing the input in the array
        int [] arr = new int[n];
        for(int i=0; i<n; i++){
            arr[i] = scn.nextInt();
        }

        //Creating a variable sum to store the sum of the array
        int sum = 0;
        for(int i=0; i<n; i++){
            sum = sum + arr[i];
        }

        System.out.print("The sum of the array is: "+ sum);
    }
}
