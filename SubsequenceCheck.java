package veer.com;
public class SubsequenceCheck {
    public static boolean isSubsequence(String s, String t) {
        int i = 0, j = 0;

        // Traverse both strings
        while (i < s.length() && j < t.length()) {
            if (s.charAt(i) == t.charAt(j)) {
                i++; // move pointer for s
            }
            j++; // always move pointer for t
        }

        // If we traversed all characters of s, it is a subsequence
        return i == s.length();
    }

    public static void main(String[] args) {
        String s1 = "ace";
        String t1 = "abcde";
        System.out.println(isSubsequence(s1, t1)); // Output: true

        String s2 = "aec";
        String t2 = "abcde";
        System.out.println(isSubsequence(s2, t2)); // Output: false
    }
}
/*
How It Works

Two pointers i (for s) and j (for t)

Move through t; whenever characters match, increment i

If i reaches s.length(), it means all characters of s appeared in order in t

⚙️ Complexity
Metric	Value
Time Complexity	O(n), where n = length of t
Space Complexity	O(1)

*/