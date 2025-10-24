package veer.com;

import java.util.Arrays;

public class RemoveDuplicatesSortedWay {
 // NOT USE THE EXTRA SPACE 
    public static int removeDuplicates(int[] nums) {
        Arrays.sort(nums); 
        int j = 0;

        for (int i = 1; i < nums.length; i++) {
            if (nums[i] != nums[j]) {
                nums[++j] = nums[i];
            }
        }

        return j + 1;
    }

    public static void main(String[] args) {
        int[] nums = {3, 1, 2, 1, 4, 2, 3, 5};
        int k = removeDuplicates(nums);

        System.out.println("Unique count: " + k);
        System.out.print("Unique elements: ");
        for (int i = 0; i < k; i++) {
            System.out.print(nums[i] + " ");
        }
    }
}
