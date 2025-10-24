package veer.com;

import java.util.Arrays;

public class RotateArray {
    public void rotate(int[] nums, int k) {
        int n = nums.length;
        k = k % n;  
        int[] result = new int[n];
        
        
        for (int i = 0; i < n; i++) {
            result[(i + k) % n] = nums[i];
        }
        
        
        System.arraycopy(result, 0, nums, 0, n);
    }

    public static void main(String[] args) {
        RotateArray solution = new RotateArray();
        
        int[] nums1 = {1, 2, 3, 4, 5, 6, 7};
        solution.rotate(nums1, 3);
        System.out.println(Arrays.toString(nums1));  

    }
}
