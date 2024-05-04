class Solution {
    public int findMin(int[] nums) {
        Set<Integer>set=new HashSet<>();
        for(int i=0;i<nums.length;i++){
            set.add(nums[i]);
        }
        int min=Integer.MAX_VALUE;
        for(int n:set){
            min=Math.min(min,n);
        }
        return min;
    }
}