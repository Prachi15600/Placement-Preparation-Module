class Solution {
    
    public int reversePairs(int[] nums) {
        int low = 0, high = nums.length -1;
        return mergeSort(nums, low, high);
        
    }

    private int mergeSort(int[] nums, int low, int high) {
        int count = 0;
        if(low >= high) return 0;
        int mid = (low+high) / 2;

        count += mergeSort(nums, low, mid);
        count += mergeSort(nums, mid+1, high);
        count += countPair(nums, low, mid, high);
        merge(nums, low, mid, high);
        return count;
    }

    private void merge(int[] nums, int low, int mid, int high) {
        ArrayList<Integer> temp = new ArrayList<>();
        int left = low;
        int right = mid+1;

        while(left <= mid && right <= high) {
            if(nums[left] <= nums[right]) {
                temp.add(nums[left]);
                left++;
            }
            else {
                temp.add(nums[right]);
                right++;
            }
        }
        while(left <= mid) {
            temp.add(nums[left]);
            left++;
        }
        while(right <= high) {
            temp.add(nums[right]);
            right++;
        }

        for(int i=low; i<=high; i++) {
            nums[i] = temp.get(i - low);
        }
    }

    private int countPair(int[] nums, int low, int mid, int high) {
        int right = mid + 1;
        int count = 0;
        for(int i=low; i<=mid; i++) {
            while(right <= high && nums[i] > 2L * nums[right]) {
                right++;
            }
            count = count + (right - (mid+1));
        }
        return count;
    }
}