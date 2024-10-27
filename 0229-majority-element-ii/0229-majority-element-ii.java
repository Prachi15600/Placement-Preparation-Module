class Solution {
    public List<Integer> majorityElement(int[] nums) {
        int cnt1 = 0, cnt2 = 0;
        int n = nums.length;
        int el1 = Integer.MIN_VALUE,  el2 = Integer.MIN_VALUE;
        List<Integer> ans = new ArrayList<>();
        
        for(int i=0; i<n; i++) {
            if(cnt1 == 0 && el2 != nums[i]) {
                cnt1 = 1;
                el1 = nums[i];
            }
               
            else if(cnt2 == 0 && el1 != nums[i]) {
                cnt2 = 1;
                el2 = nums[i];
            }
            
            else if(el1 == nums[i]) cnt1++;
            else if(el2 == nums[i]) cnt2++;
            
            else {
                cnt1--;
                cnt2--;
            }        
        }
        
        cnt1 = 0; 
        cnt2 = 0;
        for(int i=0; i<n; i++) {
            if(el1 == nums[i]) cnt1++;
            if(el2 == nums[i]) cnt2++;
        }
        
        if(cnt1 > n/3) {
            ans.add(el1);
        }
        
        if(cnt2 > n/3) {
            ans.add(el2);
        }
        
        return ans;
    }
}