class Solution {
    public int countTriples(int n) {
        int count = 0;
        for (int i = 1; i <= n; i++) {
            for (int j = i; j <= n; j++) { // Start j from i to avoid counting duplicates
                int sumOfSquares = i * i + j * j;
                int k = (int)Math.sqrt(sumOfSquares);
                // Check if k is within the limit and if i^2 + j^2 is a perfect square
                if (k <= n && k * k == sumOfSquares) {
                    count++; // Increment count for (i, j, k)
                    if (i != j) {
                        count++; // Increment count again for (j, i, k) if i and j are different
                    }
                }
            }
        }
        return count;
    }
}
