package priya.northeastern.edu;

import java.util.Arrays;

public class IsomorphicStrings {
        public static boolean checkString(String s, String t) {

            int[] mappingDictStoT = new int[256];
            Arrays.fill(mappingDictStoT, -1);

            int[] mappingDictTtoS = new int[256];
            Arrays.fill(mappingDictTtoS, -1);

            for (int i = 0; i < s.length(); ++i) {
                char c1 = s.charAt(i);
                char c2 = t.charAt(i);

                // Case 1: No mapping exists in either of the dictionaries
                if (mappingDictStoT[c1] == -1 && mappingDictTtoS[c2] == -1) {
                    mappingDictStoT[c1] = c2;
                    mappingDictTtoS[c2] = c1;
                }

                // Case 2: Ether mapping doesn't exist in one of the dictionaries or Mapping exists and
                // it doesn't match in either of the dictionaries or both
                else if (!(mappingDictStoT[c1] == c2 && mappingDictTtoS[c2] == c1)) {
                    return false;
                }
            }
            return true;
        }

        public static void main(String[] args){
            String s1="egg";
            String t1="add";
            System.out.println("The strings "+ s1 + " and " + t1 + " are isomorphic: " + checkString(s1,t1));

            String s2="foo";
            String t2="bar";
            System.out.println("The strings "+ s2 + " and " + t2 + " are isomorphic: " + checkString(s2,t2));

            String s3="paper";
            String t3="title";
            System.out.println("The strings "+ s3 + " and " + t3 + " are isomorphic: " + checkString(s3,t3));
        }
}
