class Solution {

    public int[] searchRange(int[] nums, int target) {

        int first = firstPosition(nums, target);
        int last = lastPosition(nums, target);

        return new int[]{first, last};
    }

    // Find first occurrence
    public int firstPosition(int[] nums, int target) {

        int st = 0;
        int ed = nums.length - 1;

        int ans = -1;

        while (st <= ed) {

            int mid = st + (ed - st) / 2;

            if (nums[mid] == target) {

                ans = mid;
                ed = mid - 1; 
            }

            else if (target > nums[mid]) {
                st = mid + 1;
            }

            else {
                ed = mid - 1;
            }
        }

        return ans;
    }

    // Find last occurrence
    public int lastPosition(int[] nums, int target) {

        int st = 0;
        int ed = nums.length - 1;

        int ans = -1;

        while (st <= ed) {

            int mid = st + (ed - st) / 2;

            if (nums[mid] == target) {

                ans = mid;
                st = mid + 1; 
            }

            else if (target > nums[mid]) {
                st = mid + 1;
            }

            else {
                ed = mid - 1;
            }
        }

        return ans;
    }
}