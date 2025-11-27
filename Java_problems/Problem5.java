//Hollow Diamond  star patten 
class Problem5 {
    public static void main(String[] args) {
        int n = 7;
        int nsp = 1;
        int nst = n/2+1;
        for(int i=1; i<=n; i++){
            for(int j=1; j<=nst; j++){
                System.out.print("*");
            }
            for(int j=1; j<=nsp; j++){
                System.out.print(" ");
            }
            for(int j=1; j<=nst; j++){
                System.out.print("*");
            }
            if (i<=n/2) {
                nst = nst-1;
                nsp = nsp+2;
            } else {
                nst = nst+1;
                nsp = nsp-2;
            }
            System.out.println();
        }
    }
}
