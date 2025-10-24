package veer.com;

public class SearchInRotatedSortedArray {

    public static int search(int[] nums, int target) {
        int left = 0, right = nums.length - 1;

        while (left <= right) {
            int mid = left + (right - left) / 2;

            if (nums[mid] == target) {
                return mid; // found target
            }

            // Check if left half is sorted
            if (nums[left] <= nums[mid]) {
                // Target lies in left half
                if (nums[left] <= target && target < nums[mid]) {
                    right = mid - 1;
                } else {
                    left = mid + 1;
                }
            } 
            // Right half is sorted
            else {
                if (nums[mid] < target && target <= nums[right]) {
                    left = mid + 1;
                } else {
                    right = mid - 1;
                }
            }
        }

        return -1; // target not found
    }

    public static void main(String[] args) {
        int[] nums1 = {4,5,6,7,0,1,2};
        int[] nums2 = {3,1};
        int[] nums3 = {1};

        System.out.println(search(nums1, 0)); // Output: 4
        System.out.println(search(nums1, 3)); // Output: -1
        System.out.println(search(nums2, 1)); // Output: 1
        System.out.println(search(nums3, 0)); // Output: -1
    }
}
