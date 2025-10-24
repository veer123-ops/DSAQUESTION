package veer.com;

public class Palindomstring {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
  String str="nitein";
  
  String str1="";
  
  for(int i=str.length()-1;i>=0;i--) {
	  str1=str1+str.charAt(i);
		  
	  
  }
  if (str.equals(str1)) {
      System.out.println(str + " pm " );
  } else {
      System.out.println(str + " pm is not " );
  }
}
}
