class Solution {
    public int[] kWeakestRows(int[][] mat, int k) {
        int soliders[]=new int[mat.length];
        for(int i=0;i<mat.length;i++){
            int count=0;
            for(int j=0;j<mat[0].length;j++){
                if(mat[i][j]==1)
                count++;
            }
            soliders[i]=count;
        }  
        
        int ans[]=new int[k];
        for(int i=0;i<k;i++){
            int min=Integer.MAX_VALUE;
            int idx=0;
            for(int j=0;j<soliders.length;j++){
                if(min>soliders[j]){
                    min=soliders[j];
                    idx=j;
                }
            }
            ans[i]=idx;
            soliders[idx]=Integer.MAX_VALUE;
      }
      return ans;
    }
}