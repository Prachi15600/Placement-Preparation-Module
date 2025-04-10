class Solution {
    public List<Integer> majorityElement(int[] nums) {
        int n = nums.length;
        int majorityThreshold = n / 3;

        HashMap<Integer, Integer> hm = new HashMap<>();
        for (int num : nums) {
            hm.put(num, hm.getOrDefault(num, 0) + 1);
        }

        List<Integer> result = new ArrayList<>();
        for (int key : hm.keySet()) {
            if (hm.get(key) > majorityThreshold) {
                result.add(key);
            }
        }

        return result;
    }
}
