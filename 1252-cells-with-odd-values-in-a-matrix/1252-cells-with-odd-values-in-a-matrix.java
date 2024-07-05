class Solution {
    public int oddCells(int m, int n, int[][] indices) {
        int mat[][]=new int[m][n];
        int count=0;
        for(int k=0;k<indices.length;k++){
            int row=indices[k][0];
            int col=indices[k][1];
            for(int i=0;i<m;i++){
                for(int j=0;j<n;j++){
                    if(i==row){
                        mat[i][j]+=1;
                    }
                    if(j==col){
                        mat[i][j]+=1;
                    }
                }
            }
        }
            for(int i=0;i<mat.length;i++){
                for(int j=0;j<mat[0].length;j++){
                    if(mat[i][j]%2==1){
                        count++;
                    }
                }
            }
        
        return count;
    }
}