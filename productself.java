package veer.com;


import java.util.Arrays;

public class productself {
	
	public static void Prouself(int arr [] ,int [] res) {
  for (int i = 0; i < arr.length; i++) {
	  int sum=1;
	  
	  for (int j = 0; j < res.length; j++) {
		if (i==j) {
			continue;
		}
		sum=sum*arr[j];
	}
	

  res[i]=sum;
	}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
      int arr [] = {10,2,4,5};
      
      int res [] =new int [arr.length];
      Prouself(arr, res);
      
      System.out.print(Arrays.toString(res));
	}

}