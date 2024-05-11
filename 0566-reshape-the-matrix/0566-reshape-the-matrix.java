class Solution {
    public int[][] matrixReshape(int[][] mat, int r, int c) {
        if (mat.length == 0 || r * c != mat.length * mat[0].length) {
            return mat;
        }
        int[][] arr = new int[r][c];
        int row = 0, col = 0;
        for (int[] aMat : mat) {
            for (int anAMat : aMat) {
                arr[row][col] = anAMat;
                col++;
                if (col == c) {
                    col = 0;
                    row++;
                }
            }
        }
        return arr;
    }
}