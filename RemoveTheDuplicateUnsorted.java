package veer.com;

import java.util.HashSet;

public class RemoveTheDuplicateUnsorted {

    public static int removeDuplicates(int[] nums) {
        HashSet<Integer> seen = new HashSet<>();
        int j = 0;

        for (int i = 0; i < nums.length; i++) {
            if (!seen.contains(nums[i])) {
                seen.add(nums[i]);
                nums[j++] = nums[i]; // Keep unique elements in front
            }
        }

        return j;
    }

    public static void main(String[] args) {
        int[] nums = {1, 1, 2, 2, 3, 6, 6, 8, 8, 4, 4, 7, 7, 91, 10, 10, 91, 12, 12, 2, 3, 7};
        int k = removeDuplicates(nums);
      //  System.out.println("Unique count: " + k);
        System.out.print("Modified nums: ");
        for (int i = 0; i < k; i++) {
            System.out.print(nums[i] + " ");
        }
    }
}
