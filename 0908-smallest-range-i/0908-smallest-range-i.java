class Solution {
    public int smallestRangeI(int[] nums, int k) {
        int max=0;
        int min=10000;
        for(int n:nums){
            max=Math.max(max,n);
            min=Math.min(min,n);
        }
        return Math.max(0, max-min-k*2);
    }
}