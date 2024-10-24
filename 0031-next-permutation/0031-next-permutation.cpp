class Solution {
public:
    void nextPermutation(std::vector<int>& a) {
    int index = -1;
    int n = a.size();
    
    // Search for the break point
    for (int i = n - 2; i >= 0; i--) {
        if (a[i] < a[i + 1]) {
            index = i;
            break;
        }
    }

    // If no break point was found, reverse the whole array
    if (index == -1) {
        std::reverse(a.begin(), a.end());
        return; // Add return to avoid continuing with invalid index
    }

    // Find the next element greater than a[index] and swap
    for (int i = n - 1; i > index; i--) {
        if (a[i] > a[index]) {
            std::swap(a[i], a[index]);
            break;
        }
    }

    // Reverse the portion of the array after the swapped index
    std::reverse(a.begin() + index + 1, a.end());
}
};