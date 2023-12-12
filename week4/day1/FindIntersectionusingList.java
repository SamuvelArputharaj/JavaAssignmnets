package week4.day1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class FindIntersectionusingList {

	public static void main(String[] args) {
		  // Declare and initialize the arrays
		Integer[] num1= {3, 2, 11, 4, 6, 7};
		Integer[] num2= {1, 2, 8, 4, 9, 7};
        // Convert the arrays to lists
		List <Integer>ls=new ArrayList<Integer>(Arrays.asList(num1));
		List <Integer>ls1=new ArrayList<Integer>(Arrays.asList(num2));
		
        // Find the intersection of the two lists
		ls.retainAll(ls1);
		
		// Print the intersection  foreach loop

		for (Integer  num : ls) {
			System.out.println(num);
		}

        // Print the intersection Normal for loop
		for(int i=0;i<ls.size();i++) {
			System.out.println(ls.get(i));
		}
        
		//another way to print intersection without using retainALL method
		
		for (int i=0; i<ls.size(); i++) {
			if (ls.contains(ls1.get(i))) {
				System.out.println(ls1.get(i));
			}			
		}
	}

}
