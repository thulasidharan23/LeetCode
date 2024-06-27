class Solution {
    public int minimumSum(int num) {
        int arr[]=new int[4];
        for(int i=0;i<4;i++){
            arr[i]=num%10;
            num/=10;
        }
        Arrays.sort(arr);
        int lt=(arr[0]*10)+arr[2];
        int rt=(arr[1]*10)+arr[3];
        return lt+rt;
    }
}