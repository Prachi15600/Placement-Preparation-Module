class Solution {
    public int longestConsecutive(int[] nums) {
        if(nums.length == 0) return 0;
        HashSet<Integer> hset = new HashSet<>();
        int count = 0;
        int maxi = 0;

        for(int num : nums) {
            hset.add(num);
        }

        for(int num : hset) {
            if(!hset.contains(num-1)) {
                int currNum = num;
                count = 1;
                while(hset.contains(currNum+1)) {
                    count++;
                    currNum++;
                }

                maxi = Math.max(maxi, count);
            }
        }

        return maxi;
    }
}

//{(100), (4), (200), (1), (3), (2)}