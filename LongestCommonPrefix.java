package veer.com;
public class LongestCommonPrefix {

    public static String longestCommonPrefix(String[] strs) {
        if (strs == null || strs.length == 0) return "";

        // Take first string as initial prefix
        String prefix = strs[0];

        // Compare prefix with all other strings
        for (int i = 1; i < strs.length; i++) {
            // Reduce prefix until it matches the start of strs[i]
            while (strs[i].indexOf(prefix) != 0) {
                prefix = prefix.substring(0, prefix.length() - 1);
                if (prefix.isEmpty()) return "";
            }
        }

        return prefix;
    }

    public static void main(String[] args) {
        String[] strs1 = {"flower", "flow", "flight"};
        System.out.println("Example 1 Output: " + longestCommonPrefix(strs1)); // fl

        String[] strs2 = {"dog", "racecar", "car"};
        System.out.println("Example 2 Output: " + longestCommonPrefix(strs2)); // (empty)

        String[] strs3 = {"interspecies", "interstellar", "interstate"};
        System.out.println("Example 3 Output: " + longestCommonPrefix(strs3)); // inter
    }
}

/*
Example Walkthrough

Input: ["flower", "flow", "flight"]

Start prefix = "flower"

Compare with "flow" → prefix = "flow"

Compare with "flight" → prefix = "fl"
✅ Output → "fl"

⏱️ Complexity

Time: O(S) — total number of characters in all strings (best possible).

Space: O(1)
*/