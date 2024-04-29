class Solution {
    public int maximumPrimeDifference(int[] nums) {
        List<Integer>ans=new ArrayList<>();int size=0;
        for(int i=0;i<nums.length;i++){
            boolean flag = false;
            if(nums[i]==0 ||nums[i]==1) flag=true;
            else{
            for (int j=2;j<=nums[i]/2;++j) {
            
            
                if (nums[i]%j==0) {
                flag = true;
                break;
            }
        }
            }
            if (!flag){
                ans.add(i);
                size++;
            }
        }
        System.out.print(ans);
        return ans.get(size-1)-ans.get(0);
    }
} 