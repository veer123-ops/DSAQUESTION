package veer.com;

import java.util.HashMap;

public class ContainsDuplicateWithMap {

    public static boolean containsDuplicate(int[] nums) {
        HashMap<Integer, Integer> map = new HashMap<>();

        for (int num : nums) {
            if (map.containsKey(num)) {
                return true; // duplicate found
            }
            map.put(num, 1); // store the number with any value (we don't need count)
        }

        return false; // all elements are unique
    }

    public static void main(String[] args) {
        int[] nums1 = {1, 2, 3, 1};
        int[] nums2 = {1, 2, 3, 4};

        System.out.println("Has duplicate? " + containsDuplicate(nums1)); // true
        System.out.println("Has duplicate? " + containsDuplicate(nums2)); // false
    }
}
