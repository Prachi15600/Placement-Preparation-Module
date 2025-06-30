class Solution {
    public int networkDelayTime(int[][] times, int n, int k) {
        Map<Integer, List<int[]>> adj = new HashMap<>();

        for(int[] edge : times) {
            int u = edge[0], v = edge[1], w = edge[2];
            adj.computeIfAbsent(u, x-> new ArrayList<>()).add(new int[]{v,w});
        }

        PriorityQueue<int[]> pq = new PriorityQueue<>(Comparator.comparingInt(a -> a[0]));
        int[] result = new int[n + 1];
        Arrays.fill(result, Integer.MAX_VALUE);
        result[k] = 0;
        pq.offer(new int[]{0,k});

        while(!pq.isEmpty()) {
            int[] current = pq.poll();
            int d = current[0], node = current[1];

            if(!adj.containsKey(node)) continue;

            for(int[] neighbor : adj.get(node)) {
                int adjNode = neighbor[0], weight = neighbor[1];
                if(d + weight < result[adjNode]) {
                    result[adjNode] = d + weight;
                    pq.add(new int[]{result[adjNode], adjNode});
                }
            }
        }

        int maxTime = Integer.MIN_VALUE;
        for(int i=1; i<=n; i++) {
            maxTime = Math.max(maxTime, result[i]);
        }

        return maxTime == Integer.MAX_VALUE ? -1 : maxTime;
    }
}