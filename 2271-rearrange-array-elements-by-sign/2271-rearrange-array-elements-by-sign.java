class Solution {
    public int[] rearrangeArray(int[] nums) {
        int n = nums.length;
        int[] result = new int[n];
        int pos = 0, neg = 1;

        for(int num : nums) {
            if(num >= 0) {
                result[pos] = num;
                pos = pos + 2;
            }
            else {
                result[neg] = num;
                neg = neg + 2;
            }
        }
        return result;
    }
}