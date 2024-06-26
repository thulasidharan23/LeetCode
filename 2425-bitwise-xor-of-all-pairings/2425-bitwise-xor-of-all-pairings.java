class Solution {
    public int xorAllNums(int[] nums1, int[] nums2) {
        int ans=0;
        int n1len=nums1.length;
        int n2len=nums2.length;
        if(n1len%2==1){
            for(int i=0;i<nums2.length;i++){
                ans=ans^nums2[i];
            }
        }
        if(n2len%2==1){
            for(int i=0;i<nums1.length;i++){
                ans=ans^nums1[i];
            }
        }
        return ans;
    }
}