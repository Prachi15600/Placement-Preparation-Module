class Solution {
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> res = new ArrayList<>();

        for(int i=0; i<numRows; i++) {
            List<Integer> ans = new ArrayList<>();
            for(int j=0; j<=i; j++) {
                int sum = 0;
                if(j==i || j==0) {
                    ans.add(1);
                }
                else {
                    ans.add(res.get(i-1).get(j-1) + res.get(i-1).get(j));
                }
            }
            res.add(ans);
        }
        return res;
    }
}