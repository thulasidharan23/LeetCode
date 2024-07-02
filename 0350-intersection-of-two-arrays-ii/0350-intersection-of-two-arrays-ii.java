class Solution {
    public int[] intersect(int[] nums1, int[] nums2) {
        int i=0,j=0;
        List<Integer>lt=new ArrayList<>();
        Arrays.sort(nums1);
        Arrays.sort(nums2);
        while( i<nums1.length && j<nums2.length){
            if(nums1[i]>nums2[j]){
                j++;
            }
            else if(nums1[i]<nums2[j])
            {
                i++;
            }
            else
            {
                lt.add(nums1[i]);
                i++;
                j++;
            }
        }

        int[] res=new int[lt.size()];
        int k=0;
        for(Integer v:lt){
            res[k++]=v;
        }

        return res;
    }
}