class Solution {
    public void rotate(int[][] matrix) {
        int n=matrix.length;
        for(int i=0;i<matrix.length;i++){
            for(int j=i;j<matrix[0].length;j++){
                int temp=matrix[i][j];
                matrix[i][j]=matrix[j][i];
                matrix[j][i]=temp;
            }
        }
        for(int i=0;i<n;i++){
            for(int j=0;j<n/2;j++){
                int temp=matrix[i][j];
                matrix[i][j]=matrix[i][n-j-1];
                matrix[i][n-j-1]=temp;
            }
        }

        // for(int i=0;i<n;i++) { //Anti-clockwise rotation 
        //     for(int j=0;j<n/2;j++){
        //         int temp=matrix[j][i];
        //         matrix[j][i]=matrix[n-j-1][i];
        //         matrix[n-j-1][i]=temp;
        //     }
        // }

        // for(int i=0;i<n;i++) { //180 Degree Rotation
        //     for(int j=0;j<(n+1)/2;j++) {
        //         int temp=matrix[i][j];
        //         matrix[i][j]=matrix[n-i-1][n-j-1];
        //         matrix[n-i-1][n-j-1]=temp;
        //     }
        // }
    }
}