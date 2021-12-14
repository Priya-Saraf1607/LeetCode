package priya.northeastern.edu;

public class ShortestWordDistance {

    public static int calculateDistance(String[] words, String word1, String word2) {
        int minDistance = words.length;
        for (int i = 0; i < words.length; i++) {
            if (words[i].equals(word1)) {
                for (int j = 0; j < words.length; j++) {
                    if (words[j].equals(word2)) {
                        minDistance = Math.min(minDistance, Math.abs(i - j));
                    }
                }
            }
        }
        return minDistance;
    }

    public static void main(String[] args) {

        String[] words = {"practice", "makes", "perfect", "coding", "makes"};
        String word_a = "coding";
        String word_b = "practice";
        System.out.println(calculateDistance(words, word_a, word_b));

        String[] words2 = {"practice", "makes", "perfect", "coding", "makes"};
        String word1 = "makes";
        String word2 = "coding";
        System.out.println(calculateDistance(words2, word1, word2));
    }
}
