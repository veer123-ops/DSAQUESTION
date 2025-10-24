package veer.com;

import java.util.TreeSet;

public class REMOVESORTEDARRAY {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr [] = {1,2,3,4,4,5,5,6,6,7,7};
		
		TreeSet<Integer> remove= new TreeSet<Integer>();
		
		for(int i=0;i<arr.length;i++) {
			remove.add(arr[i]);
			
		}
		
		System.out.print(remove);

	}

}
