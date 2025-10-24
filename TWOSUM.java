package veer.com;



import java.util.Arrays;
import java.util.HashMap;

public class TWOSUM {

	
	 public static int[] twosum(int arr[], int target) {
		 for(int i=0;i<arr.length;i++) {
			 for(int j=0;j<arr.length;j++) {
				 if(arr[i]+ arr[j]==target) {
					 int arr1 []= {i,j};
					 return arr1;
					 
				 }
			 }
		 }
		return null;
	 }
	 
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr [] = {1,2,3,4,5,7};
		
		int target=12;
		
		
        int[] result = twosum(arr, target);

        
        if (result != null) {
            System.out.println(Arrays.toString(result));
        } else {
            System.out.println("No solution found.");
        }
    


	}}
/*
 * 
 * 
 * public int[] twoSum(int[] nums, int target) {
        int arr[] = new int[2];
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            Integer value = map.get(target - nums[i]);
            if (value == null) {
                map.put(nums[i], i);
            } else {
                arr[0] = i;
                arr[1] = value;
            }
        }     
        return arr;
    }

    public static void main(String[] args) {
    	TWOSUM1 solution = new TWOSUM1();
        
        // Example input
        int[] nums = {2, 7, 11, 15};
        int target = 9;
        
        // Call the twoSum method and print the result
        int[] result = solution.twoSum(nums, target);
        
        // Print the result
        System.out.println("Indices of the two numbers that add up to the target:");
        System.out.println("Indices: [" + result[0] + ", " + result[1] + "]");
       // System.out.println("Index 2: " + result[1]);
    }
} // every element check itertion in array
/*
 * {2, 7, 11, 15};
 * target =9
 *  fisrt 2 pick after subract  9-2=7; persent in element in yes 
 *  after add the 2 value jo pick ki thi
 *  
 *  second 7 pick after subsacrt  9-7=2; persent in element array yes 
 *  after add  the element 7 in 
 *   map hone ke baad add the index position 
 *   after itertion in java 
 *   arr[0]=i;
 *   arr[1]=1 =value;
 *
 * 
 * 
 * */

 