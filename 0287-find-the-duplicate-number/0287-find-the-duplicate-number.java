class Solution {
    public int findDuplicate(int[] nums) {

        int[] freq = new int[nums.length];

        for(int i = 0; i < nums.length; i++) {

            freq[nums[i]]++;

            if(freq[nums[i]] > 1) {
                return nums[i];
            }
        }

        return -1;
    }
}