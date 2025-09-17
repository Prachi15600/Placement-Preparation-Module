class Solution {
    public int[] maxSlidingWindow(int[] nums, int k) {
        int n = nums.length;
        if (n == 0) return new int[0];

        // Max-heap storing (value, index)
        PriorityQueue<int[]> pq = new PriorityQueue<>(
            (a, b) -> b[0] - a[0] // compare by value, descending
        );

        int[] res = new int[n - k + 1];
        int idx = 0;

        for (int i = 0; i < n; i++) {
            // Add current element with its index
            pq.offer(new int[]{nums[i], i});

            // When we have a full window
            if (i >= k - 1) {
                // Remove elements which are outside this window
                while (!pq.isEmpty() && pq.peek()[1] <= i - k) {
                    pq.poll();
                }

                // Top of pq is max element in current window
                res[idx++] = pq.peek()[0];
            }
        }

        return res;
    }
}