package veer.com;
public class MajorityElement1 {

    public static int majorityElement(int[] nums) {
        int count = 0;
        Integer candidate = null;

        for (int num : nums) {
            if (count == 0) {
                candidate = num;
            }
            count += (num == candidate) ? 1 : -1;
        }

        return candidate;
    }

    public static void main(String[] args) {
        // Input 1
        int[] nums1 = {3};
        System.out.println("Majority Element (Input 1): " + majorityElement(nums1));

        // Input 2
        int[] nums2 = {1,2, 1, 2};
        System.out.println("Majority Element (Input 2): " + majorityElement(nums2));
    }
}
