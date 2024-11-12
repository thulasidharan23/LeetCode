class Solution {
    public int[][] updateMatrix(int[][] mat) {
        int n=mat.length;
        int m=mat[0].length;
        
        int[][] distance=new int[n][m];
        Queue<int[]> travel=new LinkedList<>();
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                if(mat[i][j]==0){
                    travel.add(new int[]{i,j});
                    distance[i][j]=0;
                }
                else{
                    distance[i][j]=Integer.MAX_VALUE;
                }
            }
        }
        int[] row={-1,0,1,0};
        int[] col={0,1,0,-1};
        while(!travel.isEmpty()){
            int[] current=travel.poll();
            int r=current[0];
            int c=current[1];
        
            for(int i=0;i<4;i++){
                int nr=r+row[i];
                int nc=c+col[i];
                if(nr>=0 && nr<n && nc>=0 && nc<m && distance[nr][nc]>distance[r][c]+1){
                    distance[nr][nc]=distance[r][c]+1;
                    travel.add(new int[]{nr,nc});
                }
            }
        }
        return distance;
    }
}