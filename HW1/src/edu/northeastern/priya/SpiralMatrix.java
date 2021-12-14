package priya.northeastern.edu;

import java.util.ArrayList;
import java.util.List;

public class SpiralMatrix {

        public  static List<Integer> matrixSpiral(int[][] matrix) {
            List<Integer> result = new ArrayList<>();
            int rows = matrix.length;
            int columns = matrix[0].length;
            int up = 0;
            int left = 0;
            int right = columns - 1;
            int down = rows - 1;

            while (result.size() < rows * columns) {
                // Traverse from left to right.
                for (int col = left; col <= right; col++) {
                    result.add(matrix[up][col]);
                }
                // Traverse downwards.
                for (int row = up + 1; row <= down; row++) {
                    result.add(matrix[row][right]);
                }
                // Make sure we are now on a different row.
                if (up != down) {
                    // Traverse from right to left.
                    for (int col = right - 1; col >= left; col--) {
                        result.add(matrix[down][col]);
                    }
                }
                // Make sure we are now on a different column.
                if (left != right) {
                    // Traverse upwards.
                    for (int row = down - 1; row > up; row--) {
                        result.add(matrix[row][left]);
                    }
                }
                left++;
                right--;
                up++;
                down--;
            }

            return result;
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
        int[][] nums1 = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
        System.out.println("\n Matrix 1: ");
        print2D(nums1);
        List <Integer> res1 = matrixSpiral(nums1);
        System.out.println("\n Spiraled Matrix 1: "+res1);

        int[][] nums2 = {{1,2,3,4},{5,6,7,8},{9,10,11,12}};
        System.out.println("\n Matrix 2: ");
        print2D(nums2);
        List <Integer> res2 = matrixSpiral(nums2);
        System.out.println("\n Spiraled Matrix 2: "+res2);

    }



}
