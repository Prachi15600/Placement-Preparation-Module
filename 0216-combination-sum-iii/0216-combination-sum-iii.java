class Solution {
    public List<List<Integer>> combinationSum3(int k, int n) {
        List<List<Integer>> res = new ArrayList<>();
        generateCombinations(k, n, res, new ArrayList<>(), 0, 1);
        return res;
    }

    void generateCombinations(int k, int n, List<List<Integer>> res, List<Integer> subList, int sum, int index) {
        if(k==0 && sum==n) {
            res.add(new ArrayList<>(subList));
            return;
        }

        if(k==0 || sum > n || index>9) return;

        for(int i=index; i<=9; i++) {
            subList.add(i);
            generateCombinations(k-1, n, res, subList, sum+i, i+1);
            subList.remove(subList.size()-1);
           
        }

        
    }
}