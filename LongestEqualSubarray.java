package veer.com;

import java.util.*;

public class LongestEqualSubarray {
    public static int findMaxLength(int[] nums) {
        Map<Integer, Integer> map = new HashMap<>();
        int maxLength = 0;
        int count = 0;

        // store initial prefix sum 0 at index -1
        map.put(0, -1);

        for (int i = 0; i < nums.length; i++) {
            // treat 0 as -1
            count += (nums[i] == 1) ? 1 : -1;

            if (map.containsKey(count)) {
                // if same count seen before, update maxLength
                maxLength = Math.max(maxLength, i - map.get(count));
            } else {
                // store first occurrence of this count
                map.put(count, i);
            }
        }

        return maxLength;
    }

    public static void main(String[] args) {
        int[] nums1 = {0, 1};
        int[] nums2 = {0, 1, 0};
        int[] nums3 = {0, 1, 1, 1, 1, 1, 0, 0, 0};

        System.out.println(findMaxLength(nums1)); // Output: 2
        System.out.println(findMaxLength(nums2)); // Output: 2
        System.out.println(findMaxLength(nums3)); // Output: 6
        
       /*
        * Complexity

Time: O(n) — single pass through the array

Space: O(n) — storing prefix sums in HashMap
        *
        */
    }
}