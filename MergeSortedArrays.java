package veer.com;

public class MergeSortedArrays {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int nums1 [] = {1,2,3,4,0,0,0,0};
		int nums2[]= {2,5,6,7};
		
		int n=4;
		int m=4;
		
		megeSorted(nums1,nums2,n,m);
		for(int i=0;i<m+n;i++) {
			System.out.print(nums1[i] + " ");
		}

	}
		
		public static void megeSorted(int nums1[] ,int nums2[] ,  int m , int n) {
			
			/*int i=n-1;
			int j=m-1;
			int k=m+n-1;
			
			
			while(j>=0) {
				if(i>=0 && nums1[i]>nums2[j]) {
					nums1[k]=nums1[i];
					k--;
					i--;
				}
				else 
				{
					nums1[k]=nums2[j];
					k--;
					j--;
				}
			}
		}
}*/
			
			

// SECOND LOGICE
			int i=n-1;
			int j=m-1;
			int k=m+n-1;
			
			
			while(j>=0) {
				if(i>=0 && nums1[i] >nums2[j]) {
					nums1[k--] = nums1[i--];
				}else {
					nums1[k--] = nums2[j--];
				}
			}
			

		}}
