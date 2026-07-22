class Solution {
    public int[] intersect(int[] nums1, int[] nums2) {

        int[] temp = new int[Math.min(nums1.length, nums2.length)];
        boolean[] visited = new boolean[nums2.length];

        int k = 0;

        for(int i = 0; i < nums1.length; i++) {

            for(int j = 0; j < nums2.length; j++) {

                // match only if not already used
                if(nums1[i] == nums2[j] && !visited[j]) {

                    temp[k] = nums1[i];
                    k++;

                    visited[j] = true;
                    break;
                }
            }
        }

        int[] ans = new int[k];

        for(int i = 0; i < k; i++) {
            ans[i] = temp[i];
        }

        return ans;
    }
}