class Solution {
    public int diagonalPrime(int[][] nums) {
        int ans=0;
        int prime=0;
        for(int i=0;i<nums.length;i++){
            for(int j=0;j<nums[0].length;j++){
                if(i==j || i+j==nums.length){
                    int n=nums[i][j];
                    int count=0;
                    for(int k=2;k<n/2;k++){
                        if(n%k==0){
                            count=1;
                        }
                    }
                    if(count==0){
                        prime=n;
                    }
                    ans=Math.max(ans,prime);
                }
            }
        }
        return ans;
    }
}