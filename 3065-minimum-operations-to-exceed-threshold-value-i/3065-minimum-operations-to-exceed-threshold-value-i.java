class Solution {
    public int minOperations(int[] nums, int k) {
        int cnt=0;
        for(int num:nums){
            if(num<k){
                cnt++;
            }
        }
        return cnt;
    }
}