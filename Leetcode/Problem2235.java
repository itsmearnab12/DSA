import java.util.*;

class Problem2235 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int num1 = sc.nextInt();
        int num2 = sc.nextInt();

        Solution obj = new Solution();

        int result = obj.sum(num1, num2);

        System.out.println(result);
    }
}

class Solution{
    public int sum(int num1, int num2){
        return num1+num2;
    }
}