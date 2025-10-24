package veer.com;
import java.util.*;

public class FirstNonRepeatingCharacterStream {
    public static void firstNonRepeating(char[] stream) {
        Map<Character, Integer> freq = new HashMap<>();
        Queue<Character> queue = new LinkedList<>();

        for (char ch : stream) {
            freq.put(ch, freq.getOrDefault(ch, 0) + 1);
            queue.add(ch);

            // Remove repeated characters from front
            while (!queue.isEmpty() && freq.get(queue.peek()) > 1) {
                queue.poll();
            }

            if (!queue.isEmpty()) {
                System.out.print(queue.peek() + " ");
            } else {
                System.out.print("-1 "); // no non-repeating character
            }
        }
    }

    public static void main(String[] args) {
        char[] stream = {'a', 'b', 'c', 'a', 'c', 'd'};
        firstNonRepeating(stream);
        // Output: a a a b b b
    }
}
