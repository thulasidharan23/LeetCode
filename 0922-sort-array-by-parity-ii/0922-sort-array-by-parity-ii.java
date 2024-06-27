class Solution {
    public int[] sortArrayByParityII(int[] nums) {
        int ans[]=new int[nums.length];
        List<Integer>odd=new ArrayList<>();
        List<Integer>even=new ArrayList<>();
        for(int i=0;i<nums.length;i++){
            if(nums[i]%2==0){
                even.add(nums[i]);
            }
            else{
                odd.add(nums[i]);
            }
        }
        int k=0,j=0;
        for(int i=0;i<nums.length;i++){
            if(i%2==0){
                ans[i]=even.get(k++);
            }
            else{
                ans[i]=odd.get(j++);
            }
        }
        return ans;
    }
}