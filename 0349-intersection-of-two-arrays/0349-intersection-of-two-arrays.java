class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
        int i=0,j=0;
        Set<Integer> set=new HashSet<>();
        Arrays.sort(nums1);
        Arrays.sort(nums2);
        while( i<nums1.length && j<nums2.length){
            if(nums1[i]>nums2[j]){
                j++;
            }else if(nums1[i]<nums2[j]){
                i++;
            }else{
                set.add(nums1[i]);
                i++;
                j++;
            }
        }

        int[] res=new int[set.size()];
        int k=0;
        for(Integer v:set){
            res[k++]=v;
        }

        return res;
    }
}