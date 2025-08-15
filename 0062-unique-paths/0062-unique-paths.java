class Solution {
    public int uniquePaths(int m, int n) {
        int N = m-1+n-1;
        int b = n-1;
        double res = 1;
        for(int i=1; i<=b; i++) {
            res = (res*(N-b+i))/i;
        }

        return (int)res;
    }
}