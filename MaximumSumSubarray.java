package veer.com;

public class MaximumSumSubarray {

    public static int maxSubArray(int[] nums) {
        int maxSoFar = nums[0];
        int currentMax = nums[0];

        for (int i = 1; i < nums.length; i++) {
            currentMax = Math.max(nums[i], currentMax + nums[i]);
            maxSoFar = Math.max(maxSoFar, currentMax);
        }

        return maxSoFar;
    }

    public static void main(String[] args) {
        // Input 1
        int[] nums1 = {-2, 1, -3, 4, -1, 2, 1, -5, 4};
        System.out.println("Max Subarray Sum (Input 1): " + maxSubArray(nums1));

        // Input 2
        int[] nums2 = {1};
        System.out.println("Max Subarray Sum (Input 2): " + maxSubArray(nums2));
    }
}
