package priya.northeastern.edu;

public class Question3 {

        public static int subarrayContinousSum(int[] nums, int k) {
            int count = 0;
            int[] sum = new int[nums.length + 1];
            sum[0] = 0;
            for (int i = 1; i <= nums.length; i++)
                sum[i] = sum[i - 1] + nums[i - 1];
            for (int start = 0; start < nums.length; start++) {
                for (int end = start + 1; end <= nums.length; end++) {
                    if (sum[end] - sum[start] == k)
                        count++;
                }
            }
            return count;
        }

    public static void main(String[] args) {

        int[] input1 = {1,1,1};
        System.out.println("Result 1 is: "+subarrayContinousSum(input1,2));
        int[] input2 = {1,2,3};
        System.out.println("Result 2 is: "+ subarrayContinousSum(input2,3));


    }

}
