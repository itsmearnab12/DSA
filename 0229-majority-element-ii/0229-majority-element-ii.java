import java.util.*;

class Solution {
    public List<Integer> majorityElement(int[] nums) {

        HashMap<Integer, Integer> map = new HashMap<>();
        List<Integer> result = new ArrayList<>();

        int n = nums.length;

        for (int num : nums) {
            map.put(num, map.getOrDefault(num, 0) + 1);
        }

        for (int num : map.keySet()) {
            if (map.get(num) > n / 3) {
                result.add(num);
            }
        }

        return result;
    }
}