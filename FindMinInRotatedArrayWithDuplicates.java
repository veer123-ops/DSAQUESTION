package veer.com;

public class FindMinInRotatedArrayWithDuplicates {
    public static int findMin(int[] nums) {
        int start = 0;
        int end = nums.length - 1;

        while (start < end) {
            int mid = start + (end - start) / 2;

            if (nums[mid] > nums[end]) {
                start = mid + 1;
            }
            
            else if (nums[mid] < nums[end]) {
                end = mid;
            }
            
            else {
                end--;
            }
        }

       
        return nums[start];
    }

    public static void main(String[] args) {
        int[] nums = {2, 2, 2, 3, 1, 2,8,2};
        int min = findMin(nums);
        System.out.println("Minimum element: " + min);
    }
}
