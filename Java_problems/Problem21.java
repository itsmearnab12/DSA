public class Problem21 {
    public static void main(String[] args) {
        int a = 10;
        int b = 20;
        swap(a, b);
        System.out.println("The value of a: "+a);
        System.out.println("The value of b: "+b);
    }
    public static void swap(int a, int b){
        int temp = a;
        a = b;
        b = temp;
    }  
}
