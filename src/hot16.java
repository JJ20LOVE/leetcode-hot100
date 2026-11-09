public class hot16 {
    public static void main(String[] args) {

    }

    public void rotate(int[][] matrix) {
        if(matrix==null||matrix.length==0||matrix[0].length==0) return;
        for(int i=0; i< matrix.length; i++){
            for(int j=0; j<=i; j++){
                int temp=matrix[i][j];
                matrix[i][j]=matrix[j][i];
                matrix[j][i]=temp;
            }
        }
        for(int j=0; j<matrix.length; j++){
            for(int i=0; i< matrix[0].length/2; i++){
                int temp=matrix[j][i];
                matrix[j][i]=matrix[j][matrix[0].length-1-i];
                matrix[j][matrix[0].length-1-i]=temp;
            }
        }
    }
}
