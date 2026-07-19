class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {

        int[] uni1 = Arrays.stream(nums1).distinct().sorted().toArray();
        int[] uni2 = Arrays.stream(nums2).distinct().sorted().toArray();

        List<Integer> ans = new ArrayList<>();

        int i = 0, j = 0;

        while (i < uni1.length && j < uni2.length) {

            if (uni1[i] == uni2[j]) {
                ans.add(uni1[i]);
                i++;
                j++;
            } else if (uni1[i] < uni2[j]) {
                i++;
            } else {
                j++;
            }
        }

        return ans.stream().mapToInt(Integer::intValue).toArray();
    }
}