//Triangle pattern with number
class Problem6 {
    public static void main(String[] args) {
        int n = 4;
        int count = 1;
        int nst = 1;
        for(int i=1; i<=n; i++){
            for(int j=1; j<=nst; j++){
                System.out.print(count);
                count++;
            }
            nst++;
            System.out.println();
        }
    }
}
