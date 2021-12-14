package priya.northeastern.edu;

public class MoveZeroes {
    public static void zeroToEnd(int[] nums) {
        if (nums == null || nums.length == 0) return;

        int insertPos = 0;
        for (int num : nums) {
            if (num != 0) nums[insertPos++] = num;
        }

        while (insertPos < nums.length) {
            nums[insertPos++] = 0;
        }
    }

    public static void print1D(int[] mat) {
        System.out.print("[");
        for (int i = 0; i < mat.length; i++) {
            if (i == mat.length - 1) {
                System.out.print(mat[i]);
            } else {
                System.out.print(mat[i] + ",");
            }
        }
        System.out.print("]");
    }

    public static void main(String[] args) {
        int[] nums1 = {0, 1, 0, 3, 12};
        System.out.println("\n Array Nums 1: ");
        print1D(nums1);
        zeroToEnd(nums1);
        System.out.println("\n Moved Zeroes Array Nums 1: ");
        print1D(nums1);

        int[] nums2 = {0};
        System.out.println("\n Array Nums 2: ");
        print1D(nums2);
        zeroToEnd(nums2);
        System.out.println("\n Moved Zeroes Array Nums 2: ");
        print1D(nums2);

    }

}
