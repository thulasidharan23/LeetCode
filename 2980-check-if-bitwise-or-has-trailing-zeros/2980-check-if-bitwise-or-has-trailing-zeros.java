class Solution {
    public boolean hasTrailingZeros(int[] nums) {
        int count=0;
        for(int num:nums){
            boolean isLSBSet=(num&1)==0;
            if(isLSBSet){
                count++;
            }
            if(count>=2){
                return true;
            }
        }
        return false;
    }
}