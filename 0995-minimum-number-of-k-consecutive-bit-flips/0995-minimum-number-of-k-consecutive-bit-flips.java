class Solution {
    public int minKBitFlips(int[] nums, int k) {
        int n = nums.length;
        int[] flipped = new int[n];
        int check = 0;
        int count = 0;
        for (int i = 0; i < n; i++) {
            if (i >= k) {
                check ^= flipped[i - k];
            }
            if (check % 2 == nums[i]) {
                if (i + k > n) {
                    return -1;
                }
                flipped[i] = 1;
                check ^= 1;
                count++;
            }
        }
        return count;
    }
}