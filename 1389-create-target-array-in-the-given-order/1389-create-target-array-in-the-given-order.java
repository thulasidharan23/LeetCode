class Solution {
    public int[] createTargetArray(int[] nums, int[] index) {
        int arr[]=new int[nums.length];
        Arrays.fill(arr,-1);
        for(int i=0;i<nums.length;i++){
            if(arr[index[i]]==-1){
                arr[index[i]]=nums[i];
            }
            else{
                for(int j=arr.length-1;j>index[i];j--){
                    arr[j]=arr[j-1];
                }
                arr[index[i]]=nums[i];
            }
        }
        return arr;
    }
}