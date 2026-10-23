class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        int n=matrix.length;
        int m=matrix[0].length;
        int l=0,r=n*m-1;
        while(l<=r){
            int mid=(l+r)/2;
            int col=mid %m;
            int row=mid/m;
            if(matrix[row][col]==target){
                return true;
            }

            else if(matrix[row][col]<target)l=mid+1;
            else r=mid-1;

        }
        return false;
        
    }
}