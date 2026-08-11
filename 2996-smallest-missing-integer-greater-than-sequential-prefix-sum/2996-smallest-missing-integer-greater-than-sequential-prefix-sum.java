class Solution {
    public int missingInteger(int[] nums) {
        
        // Find sum of longest sequential prefix
        int sum = nums[0];

        for (int i = 1; i < nums.length; i++) {
            if (nums[i] == nums[i - 1] + 1) {
                sum += nums[i];
            } else {
                break;
            }
        }

        // Store all numbers in a HashSet
        HashSet<Integer> set = new HashSet<>();

        for (int num : nums) {
            set.add(num);
        }

        // Find the smallest missing number >= sum
        while (set.contains(sum)) {
            sum++;
        }

        return sum;
    }
}