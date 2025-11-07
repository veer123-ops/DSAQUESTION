package veer.com;
public class LengthOfLastWord {

    public static int lengthOfLastWord(String s) {
        int length = 0;
        int i = s.length() - 1;

        // Step 1: Skip trailing spaces
        while (i >= 0 && s.charAt(i) == ' ') {
            i--;
        }

        // Step 2: Count characters in the last word
        while (i >= 0 && s.charAt(i) != ' ') {
            length++;
            i--;
        }

        return length;
    }

    public static void main(String[] args) {
        String s1 = "Hello World";
        System.out.println("Example 1 Output: " + lengthOfLastWord(s1)); // 5

        String s2 = "   fly me   to   the moon  ";
        System.out.println("Example 2 Output: " + lengthOfLastWord(s2)); // 4

        String s3 = "luffy is still joyboy";
        System.out.println("Example 3 Output: " + lengthOfLastWord(s3)); // 6
    }
}

/*
Explanation

Let’s take s = " fly me to the moon "

1️⃣ Skip trailing spaces → stop at 'n' in "moon"
2️⃣ Count characters backward until a space → "m", "o", "o", "n"
3️⃣ Count = 4 ✅

⏱️ Complexity

Time Complexity: O(n) — single backward pass

Space Complexity: O(1) — constant memory
*/