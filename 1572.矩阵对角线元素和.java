class Solution {
    public int diagonalSum(int[][] mat) {
        int sum1 =0;
        int sum2=0;
        int sum3 =0;
     for(int i =0;i<mat.length;i++){
         sum1 +=mat[i][i];
         sum2 +=mat[i][mat.length-i-1];
        if(mat.length%2 == 1){
            sum3 =sum1+sum2-mat[mat.length/2][mat.length/2];
        }
        else {
            sum3 =sum1+sum2;
        }
     }
     return sum3;
    }
}
