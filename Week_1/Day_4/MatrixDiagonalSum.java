class Solution {
    public int diagonalSum(int[][] mat) {
        int m = mat.length;
        int sum = 0;
        for(int i=0; i<m; i++){
            sum = sum + mat[i][i];
            sum = sum + mat[i][m - 1 - i];
        }
        if(m % 2 != 0){
            sum = sum - mat[m/2][m/2];
        }
        return sum;
        
    }
}
