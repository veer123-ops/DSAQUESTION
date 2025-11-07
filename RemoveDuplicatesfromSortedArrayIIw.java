package veer.com;
public  class RemoveDuplicatesfromSortedArrayIIw{
	
	//Optimal Two-Pointer Solution
    public  static int removeDuplicates(int[] nums) {
        if (nums.length <= 2) return nums.length;

        int k = 2; // Start from index 2 since first two elements can always stay

        for (int i = 2; i < nums.length; i++) {
            // Compare current element with the element two positions before
            if (nums[i] != nums[k - 2]) {
                nums[k] = nums[i];
                k++;
            }
        }

        return k;
    }

    // For testing
    public static void main(String[] args) {
       // Solution sol = new Solution();
        int[] nums = {0,0,1,1,1,1,2,3,3};

        int k = removeDuplicates(nums);
        System.out.println("k = " + k); // Output: 7

        // Print elements that remain (first k)
        for (int i = 0; i < k; i++) {
            System.out.print(nums[i] + " ");
        }
        // Output: 0 0 1 1 2 3 3
    }
}

/*
 * 
 * Type	Complexity
Time Complexity	O(n)
Space Complexity	O(1) (in-place modification)
 * 
 */
