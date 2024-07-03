class Solution {
    public void backtrack(int i,int j,int image[][],int color,int row,int col,int start){
        if((i<0 || i>=row )||(j<0 || j>=col)){
            return;
        }
        if(start!=image[i][j]||image[i][j]==color){
            return;
        }
        image[i][j]=color;
        backtrack(i-1,j,image,color,row,col,start);
        backtrack(i+1,j,image,color,row,col,start);
        backtrack(i,j-1,image,color,row,col,start);
        backtrack(i,j+1,image,color,row,col,start);
        
    }
    public int[][] floodFill(int[][] image, int sr, int sc, int color) {
        int start=image[sr][sc];
        int row=image.length;
        int col=image[0].length;
        backtrack(sr,sc,image,color,row,col,start);
        return image;
    }
}