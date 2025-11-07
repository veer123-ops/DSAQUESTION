package veer.com;
public class RemoveDuplicatesfromSortedArray{
	
	//Optimal Two-Pointer Solution
    public static  int removeDuplicates(int[] nums) {
        if (nums.length == 0) return 0;

        int k = 1; // Pointer for next unique element position

        for (int i = 1; i < nums.length; i++) {
            if (nums[i] != nums[i - 1]) {  // Found a new unique element
                nums[k] = nums[i];
                k++;
            }
        }

        return k;
    }

    // For testing
    public static void main(String[] args) {
       // Solution sol = new Solution();
        int[] nums = {0, 0, 1, 1, 1, 2, 2, 3, 3, 4};

        int k = removeDuplicates(nums);
        System.out.println("k = " + k); // Output: 5

        // Print unique elements
        for (int i = 0; i < k; i++) {
            System.out.print(nums[i] + " ");
        }
        // Output: 0 1 2 3 4
    }
}
