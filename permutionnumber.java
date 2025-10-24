package veer.com;

import java.util.Arrays;

public class permutionnumber {
	
	
	public static void Permutions(int arr [] ,int start) {
		if(start==arr.length-1) {
			System.out.println(Arrays.toString(arr));
		}for (int i = start; i < arr.length; i++) {
			Swapmethod(arr, start, i);
			Permutions(arr, start+1);
		}
	}
	/// swap method  
	
	public static void Swapmethod(int nums [],int i,int j) {
		
		int temp=nums[i];
		nums[i]=nums[j];
		nums[j]=temp;
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
   int arr [] = {1,2,3,4};
   Permutions(arr, 0);
   
	}

}