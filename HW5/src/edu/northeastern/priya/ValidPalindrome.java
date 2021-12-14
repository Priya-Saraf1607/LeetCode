package priya.northeastern.edu;

public class ValidPalindrome {
    public static boolean checkStringPalindrome(String s) {
        StringBuilder builder = new StringBuilder();

        for (char ch : s.toCharArray()) {
            if (Character.isLetterOrDigit(ch)) {
                builder.append(Character.toLowerCase(ch));
            }
        }

        String filteredString = builder.toString();
        String reversedString = builder.reverse().toString();

        return filteredString.equals(reversedString);
    }

    public static void main(String[] args) {
        String s1 = "A man, a plan, a canal: Panama";
        System.out.println("String " + s1 + " is a palindrome: " + checkStringPalindrome(s1));

        String s2 = "race a car";
        System.out.println("String " + s2 + " is a palindrome: " + checkStringPalindrome(s2));

    }
}
