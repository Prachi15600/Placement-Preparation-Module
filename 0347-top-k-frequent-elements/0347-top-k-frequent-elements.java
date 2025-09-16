class Solution {
    class Pair {
        int val, freq;
        Pair(int val, int freq) {
            this.freq = freq;
            this.val = val;
        }
    }
    
    public int[] topKFrequent(int[] nums, int k) {
        HashMap<Integer, Integer> hmap = new HashMap<>();

        for(int num : nums) {
            hmap.put(num, hmap.getOrDefault(num, 0)+1);
        }

        PriorityQueue<Pair> pq = new PriorityQueue<>((a,b)->b.freq - a.freq);

        for(Map.Entry<Integer, Integer> entry : hmap.entrySet()) {
            pq.add(new Pair(entry.getKey(), entry.getValue()));
        }

        int[] res = new int[k];

        for(int i=0; i<k; i++) {
            Pair curr = pq.poll();
            res[i] = curr.val;
        }

        return res;
        
    }
}