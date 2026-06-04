class Solution {
    public int[][] matrixReshape(int[][] mat, int r, int c) {
        int rows = mat.length;
        int columns = mat[0].length;
        if(rows*columns != r*c){
            return mat;
        }
        int[][] remat = new int[r][c];
        for(int i=0; i<rows*columns; i++){
            remat[i/c][i%c] = mat[i/columns][i%columns];
        }
         return remat;
    }   
}