package veer.com;

public class PermutionsString {
	
	
	public static void Permutions(String string ,String string2) {
		if (string2.length()==0) {
			System.err.print(string + "  ");
			return;
		}for (int i = 0; i < string2.length(); i++) {
			String string3=string2.substring(0,i) + string2.substring(i+1);
			Permutions( string+string2.charAt(i),string3);
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
  String string ="abc";
  Permutions("",string);
  
	}

}