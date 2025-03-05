class Solution {
    public int singleNumber(int[] nums) {
        //int res = 0;
        HashMap<Integer, Integer> hm = new HashMap<>();

        for(int num : nums) {
            hm.put(num, hm.getOrDefault(num, 0) + 1);
        }

        for(Map.Entry<Integer, Integer> entry : hm.entrySet()) {
            if(entry.getValue() == 1) {
                return entry.getKey();
            }
        }
        return -1;
    }
}