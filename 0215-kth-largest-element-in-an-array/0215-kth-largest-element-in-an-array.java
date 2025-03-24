class Solution {
    public int findKthLargest(int[] nums, int k) {
        PriorityQueue<Integer> pq = new PriorityQueue<>(Collections.reverseOrder());
        int res = 0;
        for(int i=0; i<nums.length; i++) {
            pq.add(nums[i]);
        }

        while(k>0) {
            res = pq.poll();
            k--;
        }

        return res;
    }
}