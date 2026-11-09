public class hot14 {

    public void setZeroes(int[][] matrix) {

        int m = matrix.length, n = matrix[0].length;
        boolean[] rowZero = new boolean[m];
        boolean[] colZero = new boolean[n];

        // 第一遍：标记哪些行、列出现过 0
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (matrix[i][j] == 0) {
                    rowZero[i] = true;
                    colZero[j] = true;
                }
            }
        }

        // 第二遍：所在行或列被标记的元素置 0
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (rowZero[i] || colZero[j]) {
                    matrix[i][j] = 0;
                }
            }
        }
    }


}


