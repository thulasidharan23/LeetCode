class Solution {
    public int[] sortByBits(int[] arr) {
        Arrays.sort(arr);
        int idx[]=new int[arr.length];
        for(int i=0;i<arr.length;i++){
            int a=Integer.bitCount(arr[i]);
            idx[i]=a;
        }

        for(int i=1;i<arr.length;i++){
            int bitidx=idx[i];
            int val=arr[i];
            int j=i-1;
            while(j>=0 && idx[j]>bitidx){
                idx[j+1]=idx[j];
                arr[j+1]=arr[j];
                j--;
            }
            idx[j+1]=bitidx;
            arr[j+1]=val;
        }
        return arr;
    }
}