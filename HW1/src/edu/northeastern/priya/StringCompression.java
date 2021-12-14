package priya.northeastern.edu;

public class StringCompression {
    public static int formatCharArray(char[] chars) {
        int indexAns = 0, index = 0;
        while (index < chars.length) {
            char currentChar = chars[index];
            int count = 0;
            while (index < chars.length && chars[index] == currentChar) {
                index++;
                count++;
            }
            chars[indexAns++] = currentChar;
            if (count != 1)
                for (char c : Integer.toString(count).toCharArray())
                    chars[indexAns++] = c;
        }
        return indexAns;
    }

    public static void main(String[] args) {
        char[] s1 = {'a', 'a', 'b', 'b', 'c', 'c', 'c'};
        System.out.println(formatCharArray(s1));

        char[] s2 = {'a'};
        System.out.println(formatCharArray(s2));

        char[] s3 = {'a', 'b', 'b', 'b', 'b', 'b', 'b', 'b', 'b', 'b', 'b', 'b', 'b'};
        System.out.println(formatCharArray(s3));

        char[] s4 = {'a', 'a', 'a', 'b', 'b', 'a', 'a'};
        System.out.println(formatCharArray(s4));
    }
}
