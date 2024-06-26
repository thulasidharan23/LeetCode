class Solution {
    public int[] singleNumber(int[] nums) {
        int xor=0;
        for(int i=0;i<nums.length;i++){
            xor=xor^nums[i];
        }
        int bit=Integer.lowestOneBit(xor);
        List<Integer>left=new ArrayList<>();
        List<Integer>right=new ArrayList<>();
        for(int i=0;i<nums.length;i++){
            if((nums[i]|bit)==nums[i]){
                left.add(nums[i]);
            }
            else{
                right.add(nums[i]);
            }
        }
        int left_val=0,right_val=0;
        for(int i=0;i<left.size();i++){
            left_val=left_val^left.get(i);
        }
        for(int i=0;i<right.size();i++){
            right_val=right_val^right.get(i);
        }
        int ans[]={left_val,right_val};
    return ans;
    }
}