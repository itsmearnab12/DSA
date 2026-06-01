class Problem2144 {
    public int minimumCost(int[] cost) {
        int sum = 0;
        int count = 0;
        Arrays.sort(cost);
        for(int i=cost.length-1; i>=0; i--){
            if(count%3 != 2){
                sum = sum+cost[i];
            }
            count++;
        }
        return sum;
    }
}