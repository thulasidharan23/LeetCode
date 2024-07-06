class Solution {
    public int[] replaceElements(int[] arr) {
        int ans[]=new int[arr.length];
        for(int i=0;i<arr.length-1;i++){
            int max=0;
            for(int j=i+1;j<arr.length;j++){
                max=Math.max(max,arr[j]);
            }
            ans[i]=max;
        }
        ans[ans.length-1]=-1;
        return ans;
    }
}