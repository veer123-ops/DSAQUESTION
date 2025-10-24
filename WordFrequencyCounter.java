package veer.com;
import java.util.*;

public class WordFrequencyCounter {
    public static Map<String, Integer> countWordFrequency(String text) {
        Map<String, Integer> freq = new HashMap<>();
        String[] words = text.toLowerCase().split("\\W+"); // split by non-word chars

        for (String word : words) {
            freq.put(word, freq.getOrDefault(word, 0) + 1);
        }

        return freq;
    }

    public static void main(String[] args) {
        String text = "The cat and the dog and the mouse";
        System.out.println(countWordFrequency(text));
        // Output: {the=3, cat=1, and=2, dog=1, mouse=1}
    }
}
