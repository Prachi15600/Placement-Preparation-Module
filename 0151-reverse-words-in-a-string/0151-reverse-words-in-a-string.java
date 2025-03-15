class Solution {
    public String reverseWords(String s) {
        ArrayList<String> arr = new ArrayList<>();
        String st = "";

        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == ' ') { 
                if (!st.isEmpty()) { 
                    arr.add(st);  // Add word to list
                    st = ""; // Reset word
                }
            } else {
                st += s.charAt(i);
            }
        }

        if (!st.isEmpty()) arr.add(st); // Add last word

        // Reverse the list
        Collections.reverse(arr);
        
        // Convert back to string
        return String.join(" ", arr);
    }
}