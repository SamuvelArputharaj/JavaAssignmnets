package week4.day2;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class RemoveDuplicateAssignment {

	public static void main(String[] args) {
		
		String input= "PayPal India";
		String replaceAll = input.replaceAll(" ", "");
		 char[] ch = replaceAll.toCharArray();
		 Set<Character> dupChar = new HashSet<Character>();
		 for (Character character : dupChar) {
			System.out.println(character);
		}
		 for(int i =0; i< ch.length; i++) {
			     dupChar.add(ch[i]);
		 }
		 
		 System.out.println(dupChar);
		

	}

}
