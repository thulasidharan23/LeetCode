class Solution {
    public int[] productExceptSelf(int[] nums) {
        int larr[]=new int[nums.length];
        int rarr[]=new int[nums.length];
        larr[0]=1;
        rarr[nums.length-1]=1;
        int ans[]=new int[nums.length];
        for(int i=1;i<nums.length;i++){
            larr[i]=larr[i-1]*nums[i-1];
        }
        for(int i=nums.length-2;i>=0;i--){
            rarr[i]=rarr[i+1]*nums[i+1];
        }
        for(int i=0;i<nums.length;i++){
            ans[i]=larr[i]*rarr[i];
        }
        return ans;
    }
    
}