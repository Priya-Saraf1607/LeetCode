package priya.northeastern.edu;

import java.util.*;

public class Question2 {
        public static List<List<String>> groupGrams(String[] strs) {
            if (strs.length == 0) return new ArrayList();
            Map<String, List> ans = new HashMap<String, List>();
            for (String s : strs) {
                char[] ca = s.toCharArray();
                Arrays.sort(ca);
                String key = String.valueOf(ca);
                if (!ans.containsKey(key)) ans.put(key, new ArrayList());
                ans.get(key).add(s);
            }
            return new ArrayList(ans.values());
        }

    public static void main(String[] args) {

            String [] input1 = {"eat","tea","tan","ate","nat","bat"};
        System.out.println("Result 1"+groupGrams(input1));

        String [] input2 = {""};
        System.out.println("Result 2"+groupGrams(input2));

        String [] input3 = {"a"};
        System.out.println("Result 3"+groupGrams(input3));
    }
}
