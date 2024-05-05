class Solution {
    public int findLucky(int[] arr) {
        Arrays.sort(arr);
        int ans=-1;
        int length=arr.length;
        for(int i=0;i<length;i++){
            int count=1;
            while(i+1<length && arr[i]==arr[i + 1]){
                count++;
                i++;
            }
            if(count==arr[i]) {
                ans=Math.max(ans,arr[i]);
            }
        }
        if(ans!=-1){
            return ans;
        }
        return -1;
    }
}