package veer.com;

public class MaximumSumSubarray {

    public static int maxSubArray(int[] nums) {
       /* int maxSoFar = nums[0];
        int currentMax = nums[0];

        for (int i = 1; i < nums.length; i++) {
            currentMax = Math.max(nums[i], currentMax + nums[i]);
            maxSoFar = Math.max(maxSoFar, currentMax);
        	/*maxSoFar+=nums[i];
        	if(maxSoFar>currentMax)
        		currentMax=maxSoFar;
        	if(maxSoFar<0) maxSoFar=0;*/
        //}

       // return maxSoFar;
       // return currentMax;
    	
    	//SECOND LOGIC
    	
    	int sum=0;
    	int maxsum=nums[0];
    	
    	for(int i=0;i<nums.length;i++) {
    		sum+=nums[i];
    		
    		if(sum>maxsum) maxsum=sum;
    		if(sum<0) sum=0;
    		
    		
    	}
		return maxsum;
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
