class Solution {
    public int largestCombination(int[] c) {
        int arr[]=new int[32];
        int count=0;
        for(int i=0;i<c.length;i++){
            for(int j=0;j<32;j++){
                int temp=(c[i]&(1<<j));
                if(temp!=0){
                    arr[j]++;
                }
            }
        }
        return Arrays.stream(arr).max().getAsInt();
    }
}