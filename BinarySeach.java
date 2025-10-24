package veer.com;

public class BinarySeach {

	
	public static int  Binary(int arr []) {
		int start=0;
		int end=arr.length-1;
		int target=5;
		
		while(start<=end) {
			int  mid=(start+end)/2;
			if(arr[mid]<target) {
				start=mid+1;
			}else if(arr[mid]> target) {
				end = mid -1;
			}else {
				return mid;
			}
		}
		return -1;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
  int arr [] = {1,2,3,5,7};
  
  System.out.print(Binary(arr));
  
	}

}
