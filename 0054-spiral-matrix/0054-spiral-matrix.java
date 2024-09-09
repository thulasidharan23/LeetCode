class Solution {
    public List<Integer> spiralOrder(int[][] matrix) {
        List<Integer> values=new ArrayList<>();
        int str_row=0;
        int str_col=0;
        int end_row=matrix.length-1;
        int end_col=matrix[0].length-1;
        int flag=0;

        while(str_row<=end_row && str_col<=end_col){
            if(flag==0){
                for(int i=str_col;i<=end_col;i++){
                    values.add(matrix[str_row][i]);
                }
                str_row++;
                    flag++;
                
            }

            else if(flag==1){
                for(int i=str_row;i<=end_row;i++){
                    values.add(matrix[i][end_col]);
                }
                    end_col--;
                    flag++;
                
            }

             else if(flag==2){
                for(int i=end_col;i>=str_col;i--){
                    values.add(matrix[end_row][i]);
                }
                    end_row--;
                    flag++;
                
            }

            else if(flag==3){
                for(int i=end_row;i>=str_row;i--){
                    values.add(matrix[i][str_col]);
                }
                    str_col++;
                    flag=0;
            }
        
    }
    return values;
}
}