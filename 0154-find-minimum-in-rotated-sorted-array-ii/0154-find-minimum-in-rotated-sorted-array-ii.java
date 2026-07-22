class Solution {
    public int findMin(int[] nums) {
        int st = 0;
        int ed = nums.length-1;
        while(st<ed){
            int mid = st + (ed-st)/2;

            if(nums[mid]>nums[ed]){
                st = mid+1;
            }
            else if(nums[mid]<nums[ed]){
                ed = mid;
            }
            else{
                ed--;
            }
        }
        return nums[st];
    }
}