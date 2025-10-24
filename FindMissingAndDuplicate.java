package veer.com;
import java.util.*;

public class FindMissingAndDuplicate {
    public static void findNumbers(int[] nums) {
        Set<Integer> seen = new HashSet<>();
        int duplicate = -1, missing = -1;
        int n = nums.length;

        for (int num : nums) {
            if (!seen.add(num)) duplicate = num;
        }

        for (int i = 1; i <= n; i++) {
            if (!seen.contains(i)) missing = i;
        }

        System.out.println("Duplicate = " + duplicate + ", Missing = " + missing);
    }

    public static void main(String[] args) {
        int[] nums = {3, 1, 2, 5, 3};
        findNumbers(nums); // Output: Duplicate = 3, Missing = 4
    }
}
