class Solution {
    int help(int n){
        int count=0;
        if(n==1){
            return 1;
        }
        if(n==2){
            return 1;
        }
        for(int i=1;i<n;i++){
            for(int j=1;j<=n;j++){
                if(n%j==1){
                    count=i;
                }
            }
        }
        return count;
    }
    public int distinctIntegers(int n) {
        int ans=help(n);
        return ans;
    }
}