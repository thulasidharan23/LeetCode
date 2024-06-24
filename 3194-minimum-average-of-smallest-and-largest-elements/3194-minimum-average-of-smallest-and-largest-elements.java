class Solution {
    public double minimumAverage(int[] nums) {
        float arr[]=new float[nums.length/2];
        Arrays.sort(nums);
        for(int i=0;i<nums.length/2;i++){
            int max=nums[nums.length-i-1];
            int min=nums[i];
            arr[i]=(float)(max+min)/2;
            System.out.println(arr[i]);
        }
        float ans=Integer.MAX_VALUE;
        for(int i=0;i<arr.length;i++){
            ans=Math.min(arr[i],ans);
        }
        return ans;
    }
}