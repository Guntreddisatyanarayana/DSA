class NumMatrix {
  int [][] mat;
    public NumMatrix(int[][] matrix) {
        mat=matrix;
    }
    
    public int sumRegion(int row1, int col1, int row2, int col2) {
         int sumRegion=0;
       for(int row =row1;row<=row2;row++){
         for(int col =col1;col<=col2;col++){
           sumRegion +=mat[row][col];
        

       }

       }
        return  sumRegion;
    }
}

/**
 * Your NumMatrix object will be instantiated and called as such:
 * NumMatrix obj = new NumMatrix(matrix);
 * int param_1 = obj.sumRegion(row1,col1,row2,col2);
 */