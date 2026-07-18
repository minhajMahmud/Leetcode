class Solution {
    public int[] topKFrequent(int[] nums, int k) {

        Map<Integer, Integer> freq = new HashMap<>();
        // Bucket array
        List<Integer>[] bucket = new ArrayList[nums.length + 1];
        // Count frequency
        for (int num : nums) {
            freq.put(num, freq.getOrDefault(num, 0) + 1);
        }
        // Put numbers into bucket
        for (int key : freq.keySet()) {
            int f = freq.get(key);

            if (bucket[f] == null) {
                bucket[f] = new ArrayList<>();
            }

            bucket[f].add(key);
        }

        int[] ans = new int[k];
        int pos = 0;

        // Traverse bucket from high frequency to low
        for (int i = bucket.length - 1; i >= 0 && pos < k; i--) {
            if (bucket[i] != null) {
                for (int num : bucket[i]) {
                    ans[pos++] = num;
                    if (pos == k) break;
                }
            }
        }

        return ans;
    }
}