package dsa.com;
public class SingleNumber {
    public static int singleNumber(int[] nums) {
    	//public static void singleNumber(int[] nums) {
        int result = 0;
       /* for (int num : nums) {
            result ^= num; // XOR all numbers
        }*/
        for(int i=0;i<nums.length;i++) {
        	result=result^nums[i];
        }
        return result;
    }

    public static void main(String[] args) {
        int[] nums1 = {2, 2, 1};
        System.out.println(singleNumber(nums1)); // Output: 1

        int[] nums2 = {4, 1, 2, 1, 2};
        System.out.println(singleNumber(nums2)); // Output: 4

        int[] nums3 = {1};
        System.out.println(singleNumber(nums3)); // Output: 1
    }}