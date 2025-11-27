//Right Angle Star patten triangle
public class Problem3 {
    public static void main(String[] args) {
        int n = 5;
        int nst = 1;
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= nst; j++) {
                System.out.print("*");
            }
            nst++;
            System.out.println();
        }
    }
}
