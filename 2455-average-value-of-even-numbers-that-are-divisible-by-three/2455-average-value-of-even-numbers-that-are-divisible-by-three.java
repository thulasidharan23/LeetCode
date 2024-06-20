class Solution {
    public int averageValue(int[] nums) {
        int sum=0;int ans1=0;
        List<Integer> ans=new ArrayList<>();
        for(int j=0;j<nums.length;j++){
            if(nums[j]%2==0 && nums[j]%3==0){
                ans.add(nums[j]);
            }
        }
            int size=ans.size();
            for(int i=0;i<size;i++){
                sum+=ans.get(i);
            }
            if(size!=0){
           ans1=(sum/size);
            }
            return ans1;
    }
}