class Solution {
    public int minOperations(int[] nums) {
        int zero=0;
        int count=0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]==0 && zero%2==0){
                zero++;
                count++;
            }
            else if(nums[i]==1 && zero%2==1){
                zero++;
                count++;
            }
        }
        return count;
    }
}