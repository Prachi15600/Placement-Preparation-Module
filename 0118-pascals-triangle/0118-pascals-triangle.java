class Solution {
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> res = new ArrayList<>();
        for(int i=0; i<numRows; i++) {
            List<Integer> ans = new ArrayList<>();
            for(int j=0; j<=i; j++) {
                int sum = 0;
                if(j==0 || j==i) {
                    ans.add(1);
                }
                else {
                    sum = res.get(i-1).get(j-1) + res.get(i-1).get(j);
                    ans.add(sum);
                }
            }
            res.add(ans);

        }

        return res;
    }
}