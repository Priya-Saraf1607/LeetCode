package priya.northeastern.edu;

public class TransposeMatrix {

    public static int[][] matrixTranspose(int[][] A) {
        int R = A.length, C = A[0].length;
        int[][] ans = new int[C][R];
        for (int r = 0; r < R; ++r)
            for (int c = 0; c < C; ++c) {
                ans[c][r] = A[r][c];
            }
        return ans;
    }

    public static void print2D(int[][] mat) {
        System.out.print("[");
        for (int i = 0; i < mat.length; i++) {
            System.out.print("[");
            for (int j = 0; j < mat[i].length; j++) {

                if (j == mat[i].length - 1) {
                    System.out.print(mat[i][j] + "");
                } else {
                    System.out.print(mat[i][j] + ",");
                }
            }
            if (i == mat.length - 1) {
                System.out.print("]");
            } else {
                System.out.print("],");
            }

        }
        System.out.print("]");
    }

    public static void main(String[] args) {
        int[][] matrix1 = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
        System.out.println("Matrix 1: ");
        print2D(matrix1);
        System.out.println("\nMatrix 1 Transpose: ");
        print2D(matrixTranspose(matrix1));

        int[][] matrix2 = {{1, 2, 3}, {4, 5, 6}};
        System.out.println("\nMatrix 2: ");
        print2D(matrix2);
        System.out.println("\nMatrix 2 Transpose: ");
        print2D(matrixTranspose(matrix2));
    }


}
