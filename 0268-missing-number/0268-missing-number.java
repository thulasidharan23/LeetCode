class Solution {
    public int missingNumber(int[] nums) {
        int n=nums.length;
        Arrays.sort(nums);
        int j=0;
        int ans=0;
        for(int i=0;i<n;i++){
            if(j==nums[i]){
                j++;
                continue;
            }  
            else
            return j;
        }
        return n;
    }
}