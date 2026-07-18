class Solution {
    public int findGCD(int[] nums) {
        int mx = Integer.MAX_VALUE;
        int mn = Integer.MIN_VALUE;

        for(int n:nums){
            mx = Math.min(mx, n);
            mn = Math.max(mn, n);
        }
        return gcd(mx, mn);
    }

    public int gcd(int a, int b){
        while(b!=0){
            int temp = b;
            b = a % b;
            a = temp;
        }
        return a;
    }
}