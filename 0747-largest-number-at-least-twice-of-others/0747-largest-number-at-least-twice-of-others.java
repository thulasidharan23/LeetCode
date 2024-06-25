class Solution {
    public int dominantIndex(int[] nums) {
        int max=Integer.MIN_VALUE;
        for(int i=0;i<nums.length;i++){
            max=Math.max(max,nums[i]);
        }
        int flag=-1;
        for(int i=0;i<nums.length;i++){
            if(nums[i]==max && flag==-1){
                flag = i;
            } 
            else if(nums[i]*2>max){
                return -1;
            }
        }
        return flag;
    }
}