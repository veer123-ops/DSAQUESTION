package veer.com;

public class RemoveDuplicatesSorted {
    public static int removeDuplicates(int[] nums) {
         int j=0;
         
         for(int i=0;i<nums.length;i++) {
        	if ( nums[j]!=nums[i]) {
        		nums[++j] =nums[i];
        	}
         }
		return ++j;
 
       
    }

    public static void main(String[] args) {
        int[] nums = {1, 1, 2, 2, 3,6,6,8,8};
        int k = removeDuplicates(nums);
        System.out.println("Unique count: " + k);
        System.out.print("Modified nums: ");
        for (int i = 0; i < k; i++) {
            System.out.print(nums[i] + " ");
        }
    }
}
