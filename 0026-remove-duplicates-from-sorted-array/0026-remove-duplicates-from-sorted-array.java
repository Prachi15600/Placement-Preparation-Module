class Solution {
    public int removeDuplicates(int[] nums) {
        int n = nums.length;
        ArrayList<Integer> arr = new ArrayList<>();

        for(int i=1; i<n; i++) {
            if(nums[i-1] == nums[i]) {
                continue;
            }
            else {
                arr.add(nums[i-1]);
            }
        }
        arr.add(nums[n-1]);
        int m = arr.size();

        for(int i=0; i<m; i++) {
            nums[i] = arr.get(i);
        }

        return m;
    }
}