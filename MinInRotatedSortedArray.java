package veer.com;

public class MinInRotatedSortedArray {

    public static int findMin(int[] nums) {
        int left = 0, right = nums.length - 1;

        while (left < right) {
            int mid = left + (right - left) / 2;

            // If mid element is greater than the rightmost, min must be in the right half
            if (nums[mid] > nums[right]) {
                left = mid + 1;
            } else {
                // Otherwise, it's in the left half including mid
                right = mid;
            }
        }

        // At the end of loop, left == right -> minimum element
        return nums[left];
    }

    public static void main(String[] args) {
        int[] nums = {3,4,5,1,2};
        System.out.println("Minimum element is: " + findMin(nums));
    }
}
