package veer.com;
public class RemoveelmentLeetcode {
	
	//Optimal In-Place Solution (Two-Pointer Approach)
    public  static int removeElement(int[] nums, int val) {
        int k = 0; // Pointer for next position of non-val element

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != val) {
                nums[k] = nums[i];
                k++;
            }
        }

        return k;
    }

    // For testing
    public static void main(String[] args) {
        //Solution sol = new Solution();
        int[] nums = {3, 2, 2, 3};
        int val = 3;

        int k = removeElement(nums, val);
        System.out.println("k = " + k); // Output: 2

        // Print modified array (first k elements are valid)
        for (int i = 0; i < k; i++) {
            System.out.print(nums[i] + " ");
        }
        // Output: 2 2
    }
}

/*
Time Complexity	       O(n) —    single pass through the array
Space Complexity	   O(1)  —   in-place modification

*/