class Solution {
    public int minimumOperations(int[] nums) {
        int count=0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]%3==0){
                continue;
            }
            int rem=nums[i]%3;
            if(rem!=0){
                nums[i]=nums[i]-rem;
                count++;
            }
        }
        return count;
    }
}