class Solution {
    public List<List<Integer>> combinationSum2(int[] candidates, int target) {
        List<List<Integer>> res = new ArrayList<>();
        Arrays.sort(candidates);
        generateSubsequence(candidates, target, 0, res, new ArrayList<>());
        return res;
    }

    void generateSubsequence(int[] arr, int target, int index, List<List<Integer>> res, List<Integer> subList) {
        if(target == 0) {
            res.add(new ArrayList<>(subList));
            return;
        }

        for(int i=index; i<arr.length; i++) {
            if(i > index && arr[i] == arr[i-1]) continue;
            if(target<arr[i]) break;

            subList.add(arr[i]);
            generateSubsequence(arr, target-arr[i], i+1, res, subList);
            subList.remove(subList.size()-1);
        }
    }
}