class Solution {
    public int findKthLargest(int[] arr, int k) {
        PriorityQueue<Integer> pq = new PriorityQueue<>(Collections.reverseOrder());
        for(int i=0; i<arr.length; i++) {
            pq.add(arr[i]);
        }

        int count = 0;
        while(!pq.isEmpty()) {
            count++;
            if(count == k) return pq.poll();
            else pq.poll();
        }
        return -1;
    }
}