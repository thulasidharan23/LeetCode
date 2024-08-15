class Solution {
    public int[] decode(int[] encoded) {
        int n=encoded.length+1;
        int a=0,b=0;
        for(int i=0;i<n-1;i+=2){
            a^=encoded[i];
        }
        for(int i=1;i<=n;++i){
            b^=i;
        }
        int[] ans = new int[n];
        ans[n-1]=a^b;
        for(int i=n-2;i>=0;--i){
            ans[i]=encoded[i]^ans[i+1];
        }
        return ans;
    }
}