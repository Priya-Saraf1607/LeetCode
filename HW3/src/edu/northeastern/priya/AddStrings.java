package priya.northeastern.edu;

public class AddStrings {

        public static String stringAddition(String num1, String num2) {
            StringBuilder res = new StringBuilder();

            int carry = 0;
            int p1 = num1.length() - 1;
            int p2 = num2.length() - 1;
            while (p1 >= 0 || p2 >= 0) {
                int x1 = p1 >= 0 ? num1.charAt(p1) - '0' : 0;
                int x2 = p2 >= 0 ? num2.charAt(p2) - '0' : 0;
                int value = (x1 + x2 + carry) % 10;
                carry = (x1 + x2 + carry) / 10;
                res.append(value);
                p1--;
                p2--;
            }

            if (carry != 0)
                res.append(carry);

            return res.reverse().toString();
        }

    public static void main(String[] args){
        String s1="11";
        String t1="123";
        System.out.println("The sum of strings "+ s1 + " and " + t1 + " : " + stringAddition(s1,t1));

        String s2="456";
        String t2="77";
        System.out.println("The sum of strings "+ s2 + " and " + t2 + " : " + stringAddition(s2,t2));

        String s3="0";
        String t3="0";
        System.out.println("The sum of strings "+ s2 + " and " + t2 + " : " + stringAddition(s3,t3));
    }


}
