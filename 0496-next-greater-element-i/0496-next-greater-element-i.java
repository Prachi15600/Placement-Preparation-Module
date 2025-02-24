import java.util.HashMap;
import java.util.Stack;

class Solution {
    public int[] nextGreaterElement(int[] nums1, int[] nums2) {
        int n = nums1.length;
        int m = nums2.length;
        int arr[] = new int[n];
        HashMap<Integer, Integer> hm = new HashMap<>();
        Stack<Integer> st = new Stack<>();

        for (int i = m - 1; i >= 0; i--) {
            while (!st.isEmpty() && st.peek() <= nums2[i]) {
                st.pop();
            }

            if (st.isEmpty()) {
                hm.put(nums2[i], -1);
            } else {
                hm.put(nums2[i], st.peek());
            }

            st.push(nums2[i]);
        }

        for (int i = 0; i < n; i++) {
            arr[i] = hm.get(nums1[i]);
        }

        return arr;
    }
}
