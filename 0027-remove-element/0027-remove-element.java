class Solution {
    public int removeElement(int[] nums, int val) {
        int n=nums.length;
        int count=0;
        Arrays.sort(nums);
        for(int i=0;i<n;i++)
        {
            if(nums[i]==val){
                continue;
            }
            nums[count]=nums[i];
                count++;
        }
        return count;
    }
}