class Solution {
    public int[] findArray(int[] pref) {
        int []arr=new int[pref.length];
        int num=pref[0];
        arr[0]=pref[0];
        for(int i=1;i<pref.length;i++){
            arr[i]=num^pref[i];
            num=arr[i]^num;
        }
        return arr;
    }
}