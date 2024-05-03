class Solution {
    public int[] rearrangeArray(int[] nums) {
        List<Integer>pos=new ArrayList<>();
        List<Integer>neg=new ArrayList<>();
        for(int i=0;i<nums.length;i++){
            if(nums[i]<0){
                neg.add(nums[i]);
            }
            else{
                pos.add(nums[i]);
            }
        }
        int arr[]=new int[nums.length];
        for(int i=0;i<arr.length;i++){
            if(i%2==0){
                arr[i]=pos.get(i/2);
            }
            else{
                arr[i]=neg.get(i/2);
            }
        }
        return arr;
    }
}