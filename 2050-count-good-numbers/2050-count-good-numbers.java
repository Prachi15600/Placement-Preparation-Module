class Solution {
    static final int MOD = 1000000007;

    public int countGoodNumbers(long n) {
        long evenCount = (n + 1) / 2;  // Count of even indices
        long primeCount = n / 2;       // Count of odd indices

        return (int) (power(5, evenCount) * power(4, primeCount) % MOD);
    }

    private long power(long base, long exp) {
        long result = 1;
        while (exp > 0) {
            if (exp % 2 == 1) result = result * base % MOD;  // Multiply when exponent is odd
            base = base * base % MOD;  // Square the base
            exp /= 2;  // Reduce exponent by half
        }
        return result;
    }
}
