class Solution {
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        List<List<Integer>> res = new ArrayList<>();
        generateCombinations(candidates, target, 0, res, new ArrayList<>());

        return res;
    }

    void generateCombinations(int[] candidates, int target, int i, List<List<Integer>> res, List<Integer> subList) {
        if(i==candidates.length) {
            if(target == 0) {
                res.add(new ArrayList<>(subList));
            }
            return;
        }

        if(candidates[i] <= target) {
            subList.add(candidates[i]);
            generateCombinations(candidates, target - candidates[i], i, res, subList);
            subList.remove(subList.size() - 1);
        }
        generateCombinations(candidates, target, i+1, res, subList);
    }
}