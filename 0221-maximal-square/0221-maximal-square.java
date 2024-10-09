class Solution {
    public int maximalSquare(char[][] m) {
        int n=m.length;
        int c=m[0].length;
        int dp[][]=new int[n][c];
        int max=0;

        for(int i=0;i<n;i++){
            for(int j=0;j<c;j++){
                if(m[i][j]=='1'){
                    if(i==0 || j==0){
                        dp[i][j]=1;
                    }
                    else {
                        dp[i][j]=1+Math.min(dp[i-1][j],Math.min(dp[i][j-1],dp[i-1][j-1]));
                        
                    }
                    max=Math.max(dp[i][j],max);
                }
                
            }
        }
        return max*max;
    }
}