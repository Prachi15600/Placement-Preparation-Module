import java.util.*;

class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        int n = nums.length;

        // Step 1: Count frequency of each number
        Map<Integer, Integer> freqMap = new HashMap<>();
        for (int num : nums) {
            freqMap.put(num, freqMap.getOrDefault(num, 0) + 1);
        }

        // Step 2: Create bucket array where index = frequency, value = list of elements
        List<Integer>[] bucket = new List[n + 1];
        for (int i = 0; i <= n; i++) {
            bucket[i] = new ArrayList<>();
        }

        for (Map.Entry<Integer, Integer> entry : freqMap.entrySet()) {
            int element = entry.getKey();
            int freq = entry.getValue();
            bucket[freq].add(element);
        }

        // Step 3: Pick k most frequent elements from right (highest frequency)
        List<Integer> result = new ArrayList<>();
        for (int i = n; i >= 0 && k > 0; i--) {
            for (int num : bucket[i]) {
                result.add(num);
                k--;
                if (k == 0) break;
            }
        }

        // Convert List to int array
        int[] ans = new int[result.size()];
        for (int i = 0; i < result.size(); i++) {
            ans[i] = result.get(i);
        }

        return ans;
    }

    public static void main(String[] args) {
        Solution sol = new Solution();
        int[] nums = {1, 1, 1, 2, 2, 3};
        int k = 2;
        System.out.println(Arrays.toString(sol.topKFrequent(nums, k))); // Output: [1, 2]
    }
}
