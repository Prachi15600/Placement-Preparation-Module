class Solution {
    public int[] rearrangeArray(int[] nums) {
        ArrayList<Integer> pos = new ArrayList<>();
        ArrayList<Integer> neg = new ArrayList<>();

        for(int i=0; i<nums.length; i++) {
            if(nums[i] >= 0){
                pos.add(nums[i]);
            }
            else neg.add(nums[i]);
        }

        int i=1;
        nums[0] = pos.get(0);
        nums[1] = neg.get(0);
        for(int j=2; j<nums.length; j++) {
            nums[j++]=pos.get(i);
            nums[j]=neg.get(i);
            i++;
        }

        return nums;
    }
}