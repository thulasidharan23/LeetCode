class Solution {
    public int subarraySum(int[] nums, int k) {
       // int i=0,j=0;
        int sum=0;
        int cnt=0;
        for(int i=0;i<nums.length;i++){
            for(int j=i;j<nums.length;j++){
                sum+=nums[j];
                if(sum==k){
                    cnt++;
                }
            }
            sum=0;
        }
        return cnt;
    }
}