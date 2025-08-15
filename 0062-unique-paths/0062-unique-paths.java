class Solution {
    public int uniquePaths(int m, int n) {
        int N = m-1+n-1;
        int d = n-1;
        double res = 1;
        for(int i=1; i<=d; i++) {
            res = (res*(N-d+i))/i;
        }

        return (int)res;
    }
}