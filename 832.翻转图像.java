class Solution {
    public int[][] flipAndInvertImage(int[][] A) {
    int c = A[0].length;
    for(int[]row:A){
        for(int i = 0;i<(c+1)/2;i++){
            int temp = row[i]^1;
            row[i] = row[c-i-1]^1;
            row[c-i-1] = temp;
        }
    }
    return A;
    }
}
