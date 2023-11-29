package week2.day2;

public class ReverseTheString {

	public static void main(String[] args) {
		String input ="Amazon development centre,Chennai";
		//Output = Chennai,centre development Amazon
		
		    String lc=input.toLowerCase();
		    String[] sp = lc.split(" ");
		    
		    for (int i = sp.length-1; i >=0; i--) {
		    	System.out.print(" "+sp[i]);
			
		   // Still not able to print exact output 
	}
	}

}
