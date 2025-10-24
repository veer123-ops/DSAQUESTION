package veer.com;

public class Reversword {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
 String str=" veer is good boy";
 
 String []  str1=str.split("\\s+");
 
 for(int i=str1.length-1;i>=0;i--) {
	 System.out.print(str1[i] + "   ");
 }
	}

}
