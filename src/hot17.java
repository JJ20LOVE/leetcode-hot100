public class hot17 {
    public static void main(String[] args) {

    }
    public boolean searchMatrix(int[][] matrix, int target) {

        int m=0;
        int n = matrix[0].length-1;
        while(n>=0&&m< matrix.length){
            if(target==matrix[m][n]) return true;
            else if(target > matrix[m][n]){
                m++;
            } else if (target< matrix[m][n]) {
                n--;
            }
        }
        return false;
    }
}
