package priya.northeastern.edu;

public class ImageRotation {

    public static void matrixRotation(int[][] matrix) {
        int n = matrix.length;
        for (int i = 0; i < (n + 1) / 2; i++) {
            for (int j = 0; j < n / 2; j++) {
                int temp = matrix[n - 1 - j][i];
                matrix[n - 1 - j][i] = matrix[n - 1 - i][n - j - 1];
                matrix[n - 1 - i][n - j - 1] = matrix[j][n - 1 - i];
                matrix[j][n - 1 - i] = matrix[i][j];
                matrix[i][j] = temp;
            }
        }
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
        matrixRotation(matrix1);
        System.out.println("\nRotated Matrix 1 : ");
        print2D((matrix1));

        int[][] matrix2 = {{5, 1, 9, 11}, {2, 4, 8, 10}, {13, 3, 6, 7}, {15, 14, 12, 16}};
        System.out.println("\nMatrix 2: ");
        print2D(matrix2);
        matrixRotation(matrix2);
        System.out.println("\nRotated Matrix 2 : ");
        print2D((matrix2));

        int[][] matrix3 = {{1}};
        System.out.println("\nMatrix 3: ");
        print2D(matrix3);
        matrixRotation(matrix3);
        System.out.println("\nRotated Matrix 3 : ");
        print2D((matrix3));

        int[][] matrix4 = {{1,2},{3,4}};
        System.out.println("\nMatrix 4: ");
        print2D(matrix4);
        matrixRotation(matrix4);
        System.out.println("\nRotated Matrix 4 : ");
        print2D((matrix4));
    }
}
