class Solution {
    public int largestRectangleArea(int[] heights) {
        // {(3,2), (2,1), (6,5), (5,1), (1,-1), (2,-1)}
        // {(2,5), (1,5), (5,6), (6, -1), (2,3), (3,-1)}
        
        Stack<Integer> st = new Stack<>();
        HashMap<Integer, Integer> rightMap = new HashMap<>();
        HashMap<Integer, Integer> leftMap = new HashMap<>();

        int n = heights.length;

        // Step 1: Find nearest smaller to LEFT for each index
        for (int i = 0; i < n; i++) {
            while (!st.isEmpty() && heights[st.peek()] >= heights[i]) {
                st.pop();
            }

            if (st.isEmpty()) {
                leftMap.put(i, -1); // no smaller element to left
            } else {
                leftMap.put(i, st.peek()); // store index of smaller element
            }

            st.push(i);
        }

        st.clear();

        // Step 2: Find nearest smaller to RIGHT for each index
        for (int i = n - 1; i >= 0; i--) {
            while (!st.isEmpty() && heights[st.peek()] >= heights[i]) {
                st.pop();
            }

            if (st.isEmpty()) {
                rightMap.put(i, n); // no smaller element to right
            } else {
                rightMap.put(i, st.peek());
            }

            st.push(i);
        }

        // Step 3: Calculate max area
        int maxArea = 0;
        for (int i = 0; i < n; i++) {
            int leftIndex = leftMap.get(i);
            int rightIndex = rightMap.get(i);
            int width = rightIndex - leftIndex - 1;
            int area = heights[i] * width;
            maxArea = Math.max(maxArea, area);
        }

        return maxArea;
    }
}