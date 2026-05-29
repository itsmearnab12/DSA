class Problem3300 {
    public int minElement(int[] nums) {
        int min = Integer.MAX_VALUE;
        for(int i = 0; i < nums.length; i++){
            int n = nums[i];
            int sum = 0;
            while(n>0){
                int digit = n%10;
                sum = sum + digit;
                n = n/10;
            }
            if(sum<min){
                min = sum;
            }
        }
        return min;
    }
}