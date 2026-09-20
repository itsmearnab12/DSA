class Solution {
    public int reverseDegree(String s) {
        int n = s.length();
        int sum = 0;
        for(int i=0; i<n; i++){
            int val=26-(s.charAt(i)-'a');
            sum+=val*(i+1);
        }
        return sum;
    }
}