// 33. Search in Rotated Sorted Array
public class Problem33 {
    public int search(int[] nums, int target) {

        int st = 0;
        int ed = nums.length - 1;

        while (st <= ed) {

            int mid = st + (ed - st) / 2;

            if (nums[mid] == target) {
                return mid;
            }

            if (nums[st] <= nums[mid]) {

                if (target >= nums[st] && target < nums[mid]) {
                    ed = mid - 1;
                } else {
                    st = mid + 1;
                }
            }

            else {

                if (target > nums[mid] && target <= nums[ed]) {
                    st = mid + 1;
                } else {
                    ed = mid - 1;
                }
            }
        }

        return -1;
    }
}