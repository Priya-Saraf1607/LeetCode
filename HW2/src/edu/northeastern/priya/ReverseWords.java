package priya.northeastern.edu;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class ReverseWords {
    public static String reverseStringWords(String s) {
        s = s.trim();
        List<String> wordList = Arrays.asList(s.split("\\s+"));
        Collections.reverse(wordList);
        return String.join(" ", wordList);
    }

    public static void main(String[] args) {
        String s1 = "the sky is blue";
        System.out.println("String " + s1 + " reversed is: " + reverseStringWords(s1));

        String s2 = "hello world ";
        System.out.println("String " + s2 + " reversed is : " + reverseStringWords(s2));

        String s3 = " good   example";
        System.out.println("String " + s2 + " reversed is : " + reverseStringWords(s3));

        String s4 ="   Bob    Loves  Alice   ";
        System.out.println("String " + s2 + " reversed is : " + reverseStringWords(s4));

        String s5 = "Alice does not even like bob";
        System.out.println("String " + s2 + " reversed is : " + reverseStringWords(s5));
    }
}
