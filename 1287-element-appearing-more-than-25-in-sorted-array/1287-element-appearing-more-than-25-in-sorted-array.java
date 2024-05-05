class Solution {
    public int findSpecialInteger(int[] arr) {
        Arrays.sort(arr);
        int length=arr.length;
        for(int i=0;i<length;i++){
            int count=1;
            while(i+1<length && arr[i]==arr[i + 1]){
                count++;
                i++;
            }
            if(count>length/4) {
                return arr[i];
            }
        }
        return 0;
    }
}