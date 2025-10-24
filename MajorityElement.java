package veer.com;



import java.util.Arrays;

public class MajorityElement {
    public static int majorityElement(int[] nums) {
    	/*Arrays.sort(nums);
    	int index=nums.length/2;
		return  nums[index];
    	*/
    	
    /*	int maj=nums[0];
    	int count=1;
    	for(int i=0;i<nums.length;i++) {
    		if(maj==nums[i])
    			count++;
    		else if(count==0) {
    			maj=nums[i];
    			count=1;
    		}
    		else count--;
    	}
		return maj;
    }
*/
    
    	
    	int maj=0;
    	int count=0;
    	
    	
    	for(int i=0;i<nums.length;i++) {
    		if(count==0) {
    			maj=nums[i];
    		}
    		if(maj==nums[i]) {
    			count++;
    		}else {
    			count--;
    		}
    	}
		return maj;
    }
    public static void main(String[] args) {
        int[] nums = {3, 2, 3,5,5,5,8};
        System.out.println("Majority element: " + majorityElement(nums)); // Output: 3
    }
}
