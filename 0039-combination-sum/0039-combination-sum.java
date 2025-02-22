class Solution {
    void helper(int[] candidates, int target, List<List<Integer>> res, List<Integer> temp, int idx) {
        if(target == 0) {
            res.add(new ArrayList<>(temp));
            return;
        }

        if(target < 0 ) return;

        for(int i=idx; i<candidates.length; i++) {
            temp.add(candidates[i]);
            helper(candidates, target - candidates[i], res, temp, i);
            temp.remove(temp.size() - 1);
        }
    }
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        List<List<Integer>> res = new ArrayList<>();
        helper(candidates, target, res, new ArrayList<>(), 0);
        return res;
    }
}