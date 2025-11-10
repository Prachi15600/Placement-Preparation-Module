class Solution {
    public List<Integer> majorityElement(int[] nums) {
        int count1 = 0, count2 = 0;
        int ele1 = 0, ele2 = 0;

        for(int num : nums) {
            if(count1 == 0 && num != ele2) {
                count1++;                   //count1 = 2, ele1 = 3, count2 = 1, ele2 = 2
                ele1 = num;
            }
            else if(count2 == 0 && num != ele1) {
                count2++;
                ele2 = num;
            }
            else if(num == ele1) {
                count1++;
            }
            else if(num == ele2) {
                count2++;
            }
            else {
                count1--;
                count2--;
            }
        }

        count1 = 0;
        count2 = 0;
        for(int num : nums) {
            if(num == ele1) count1++;
            if(num == ele2) count2++;
        }

        int mini = nums.length / 3;
        List<Integer> res = new ArrayList<>();
        if(count1 > mini) res.add(ele1);
        if(ele2 != ele1 && count2 > mini) res.add(ele2);

        return res;
 
    }
}