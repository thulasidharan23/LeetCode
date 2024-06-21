class Solution {
    public void moveZeroes(int[] nums) {
        int n = nums.length;
        int j=-1;
        for (int i=0;i<n;++i) {
            if(nums[i]!=0){//check 0 idx not contains 0
                int temp=nums[++j];//then swap to 0 positon
                nums[j]=nums[i];
                nums[i]=temp;
            }
        }
        System.out.print(nums);
    }
}