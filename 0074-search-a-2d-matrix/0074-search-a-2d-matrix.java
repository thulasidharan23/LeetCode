class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        int m=matrix.length;//row length
        int n=matrix[0].length;//column length
        int start=0;//starting point 
        int end=(m*n)-1;//end point to search
        while(start<=end){
            int mid=(start+end)/2;//mid value
            int row=mid/n;//row can calculated from mid value/column
            int col=mid%n;//col value by mid %column 
            if(matrix[row][col]==target){//binary search
                return true;
            }
            if(matrix[row][col]<target){
                start=mid+1;
            }
            else{
                end=mid-1;
            }
        }
        return false;
    }
}