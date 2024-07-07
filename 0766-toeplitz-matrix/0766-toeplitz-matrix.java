class Solution {
    public boolean isToeplitzMatrix(int[][] mat) {
        for(int i=1;i<mat.length;i++){
            for(int j=1;j<mat[0].length;j++){
                if(mat[i][j]!=mat[i-1][j-1]){
                    return false;
                }
            }
        }
        return true;
    }
}