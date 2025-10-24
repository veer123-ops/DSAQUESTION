package veer.com;
import java.util.*;

public class PalindromeListString {
    public static boolean isPalindrome(List<String> list) {
        int left = 0, right = list.size() - 1;

        while (left < right) {
            if (!list.get(left).equals(list.get(right))) return false;
            left++;
            right--;
        }

        return true;
    }

    public static void main(String[] args) {
        List<String> list1 = Arrays.asList("a", "b", "c", "b", "a");
        System.out.println(isPalindrome(list1)); // true

        List<String> list2 = Arrays.asList("hello", "world", "hello");
        System.out.println(isPalindrome(list2)); // true

        List<String> list3 = Arrays.asList("one", "two", "three");
        System.out.println(isPalindrome(list3)); // false
    }
}
