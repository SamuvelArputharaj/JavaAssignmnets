package week2.day2;

public class ReverseString {

	public static void main(String[] args) {
		
		String input="TestLeaf";
		//Output : faeLtseT
		char[] ch = input.toCharArray();
		
	  for (int i = ch.length-1; i >= 0; i--) {
		  	  System.out.print(ch[i]);	
	}

	}

}
