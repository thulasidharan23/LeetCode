class Solution {
    public int countElements(int[] nums) {
        int count=0;
        for(int i=0;i<nums.length;i++){
            int max=Integer.MIN_VALUE,min=Integer.MAX_VALUE;
            for(int j=0;j<nums.length;j++){
                if(nums[i]>nums[j]){
                    max=nums[j];
                    continue;
                }
                if(nums[i]<nums[j]){
                    min=nums[j];
                }
            }
            if(max!=Integer.MIN_VALUE && min!=Integer.MAX_VALUE){
                count++;
            }
        }
        return count;
    }
}