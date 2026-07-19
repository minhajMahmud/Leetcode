import java.util.*;

class Solution {
    public int[] intersect(int[] nums1, int[] nums2) {

        HashMap<Integer, Integer> map = new HashMap<>();
        List<Integer> ans = new ArrayList<>();

        // Count frequency of nums1
        for (int num : nums1) {
            map.put(num, map.getOrDefault(num, 0) + 1);
        }

        // Find common elements
        for (int num : nums2) {
            if (map.containsKey(num) && map.get(num) > 0) {
                ans.add(num);
                map.put(num, map.get(num) - 1);
            }
        }

        return ans.stream().mapToInt(Integer::intValue).toArray();
    }
}