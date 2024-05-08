class Solution {
    int sum(int []nums){
        int n=nums.length;
        int res=0;
        for(int i=0;i<n;i++){
            if(n%(i+1)==0){
                res=res+nums[i]*nums[i];
            }
        }
        return res;
    }
    public int sumOfSquares(int[] nums) {
        int ans=sum(nums);
         return ans;
        
    }
}