class Solution {
    public int longestConsecutive(int[] nums) {
        if(nums.length == 0) return 0;
        HashMap<Integer, Boolean> hmap = new HashMap<>();

        for(int num : nums) {
            hmap.put(num, true);
        }

        int maxi = Integer.MIN_VALUE;
        
        for(int num : hmap.keySet()) {
            if(!hmap.containsKey(num-1)) {
                int count = 1;
                int current = num;
                while(hmap.containsKey(current+1)) {
                    count++;
                    current++;
                }
                maxi = Math.max(maxi, count);
            }
        }

        return maxi;
    }
}