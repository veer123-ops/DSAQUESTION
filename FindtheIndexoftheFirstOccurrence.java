package veer.com;

public class FindtheIndexoftheFirstOccurrence{
    public static  int strStr(String haystack, String needle) {
        // If needle is empty, by definition return 0
        if (needle.isEmpty()) return 0;
        
        // Use built-in function
        return haystack.indexOf(needle);
    }

    // For testing
    public static void main(String[] args) {
        
        
        String haystack1 = "sadbutsad";
        String needle1 = "sad";
        System.out.println(strStr(haystack1, needle1)); // Output: 0
        
        String haystack2 = "leetcode";
        String needle2 = "leeto";
        System.out.println(strStr(haystack2, needle2)); // Output: -1
    }
}
