class Solution {
    public List<List<Integer>> verticalTraversal(TreeNode root) {
        Map<Integer, ArrayList<Integer>> map = new TreeMap<>();
        Queue<Pair> q = new LinkedList<>();

        q.add(new Pair(0, root));
        while(!q.isEmpty()) {
            int size = q.size();
            List<Pair> tempList = new ArrayList<>();

            for(int i=0; i< size; i++) {
                Pair curr = q.poll();
                tempList.add(curr);

                if(curr.node.left != null) {
                    q.add(new Pair(curr.hd-1, curr.node.left));
                }
                if(curr.node.right != null) {
                    q.add(new Pair(curr.hd+1, curr.node.right));
                }
            }

            Collections.sort(tempList, (a,b)->a.node.val - b.node.val);
            
            for(Pair p : tempList) {
                map.putIfAbsent(p.hd, new ArrayList<>());
                map.get(p.hd).add(p.node.val);
            }
            
        }

        List<List<Integer>> res = new ArrayList<>();
        for (ArrayList<Integer> values : map.values()) {
            res.add(values);
        }

        return res;

    }

    class Pair {
        int hd;
        TreeNode node;
        Pair(int hd, TreeNode n) {
            this.hd = hd;
            this.node = n;
        }
    }
}