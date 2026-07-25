class Solution {
    public int maxProduct(int n) {
        int first = n%10;
        n /= 10;
        int second = n%10;
        n /= 10;

        if(second > first){
            int temp = first;
            first = second;
            second = temp;
        }

        while(n > 0) {
            int a = n%10;
            n /= 10;
            if(a>first){
                second = first;
                first = a;
            }else if(a > second){
                second = a;
            }

        }
        return first * second;
    }
}