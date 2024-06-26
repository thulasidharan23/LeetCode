class Solution {
    public int getXORSum(int[] arr1, int[] arr2) {
        int ans=0,ans1=0;
        int len1=arr1.length;
        int len2=arr2.length;
        for(int i=0;i<len1;i++){
            ans=ans^arr1[i];
        }
        for(int i=0;i<len2;i++){
            ans1=ans1^arr2[i];
        }
        return ans&ans1;
    }
}