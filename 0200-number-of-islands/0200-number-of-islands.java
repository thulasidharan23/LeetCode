class Solution {
    public int numIslands(char[][] grid) {
        int n=grid.length;
        int m=grid[0].length;
        int[][] vis=new int[n][m];
        int cnt=0;
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                if(grid[i][j]=='1' && vis[i][j]==0){
                    cnt++;
                    dfs(i,j,grid,vis);
                }
            }
        }
        return cnt;
    }
    public void dfs(int i,int j,char[][]grid,int[][] vis){
        vis[i][j]=1;
        int[] row={-1, 1, 0, 0};
        int[] col={0, 0, -1, 1};

        for (int k=0;k<4;k++) {
            int r=i+row[k];
            int c=j+col[k];
            if (r>=0 && r<grid.length && c>=0 && c< grid[0].length 
                && grid[r][c]=='1' && vis[r][c]==0) {
                dfs(r,c,grid,vis);
            }
        }
    }
}