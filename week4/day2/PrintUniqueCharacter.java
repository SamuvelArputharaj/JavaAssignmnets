package week4.day2;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

public class PrintUniqueCharacter {

	public static void main(String[] args) {

		String input ="Samuvel Arputharaj";
		String replaceAll = input.replaceAll(" ", "");
		char[] ch = replaceAll.toCharArray();
		List <Character> ls = new ArrayList<Character>();
		
		for(int i=0;i<ch.length;i++) {
			ls.add(ch[i]);
		}
		System.out.println(ls);
		
		Set<Character>uniqueChar=new LinkedHashSet<Character>(ls);
        for (Character character : uniqueChar) {
	    System.out.println(character);
         }
				
	}
}
