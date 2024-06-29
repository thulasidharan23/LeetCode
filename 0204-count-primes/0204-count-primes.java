class Solution {
    public int countPrimes(int n) {
        int []arr=new int[n];
        for(int i=1;i<n;i++){
            arr[i]=1;
        }
        for(int i=2;i<arr.length;i++){
            if(arr[i]==1){
                for(int j=i*2;j<n;j+=i){
                    arr[j]=0;
                }
            }
        }
        int count=0;
        for(int i=2;i<arr.length;i++){
            if(arr[i]==1){
                count++;
            }
        }
        return count;
    }
}