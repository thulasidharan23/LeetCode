class Solution {
    public int numRookCaptures(char[][] board) {
        int row=0,col=0;
        for(int i=0;i<board.length;i++){
            for(int j=0;j<board[0].length;j++){
                if(board[i][j]=='R'){
                    row=i;col=j;
                }
            }
        }
        int count=0;
        for(int i=row;i<board.length;i++){
            if(board[i][col]=='p'){
                count++;
                break;
            }
            if(board[i][col]=='B'){
                break;
            }
        }
        for(int i=col;i<board.length;i++){
            if(board[row][i]=='p'){
                count++;
                break;
            }
            if(board[row][i]=='B'){
                break;
            }
        }
        for(int i=col;i>=0;i--){
            if(board[row][i]=='p'){
                count++;
                break;
            }
            if(board[row][i]=='B'){
                break;
            }
        }
        for(int i=row;i>=0;i--){
            if(board[i][col]=='p'){
                count++;
                break;
            }
            if(board[i][col]=='B'){
                break;
            }
        }
        return count;
    }
}