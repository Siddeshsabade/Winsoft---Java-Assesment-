Q.3.

import java.util.HashMap;
import java.util.Map;

public class WordCount {
    public static void main(String[] args) {
        String str = "My name is Siddesh. Siddesh likes playing Volleyball";

        Map<String, Integer> wordCountMap = new HashMap<>();

        String[] words = str.split("\\s+");

        for (String word : words) {
            
            word = word.replaceAll("[^a-zA-Z]", "");

            word = word.toLowerCase();

            if (word.length() > 0) {
                if (wordCountMap.containsKey(word)) {
                    wordCountMap.put(word, wordCountMap.get(word) + 1);
                } else {
                    wordCountMap.put(word, 1);
                }
            }
        }

        for (Map.Entry<String, Integer> entry : wordCountMap.entrySet()) {
            System.out.println("Word: " + entry.getKey() + ", Count: " + entry.getValue());
        }
    }
}
