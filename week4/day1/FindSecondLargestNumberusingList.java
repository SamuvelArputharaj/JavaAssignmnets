package week4.day1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class FindSecondLargestNumberusingList {

	public static void main(String[] args) {
     // Declare and initialize the array
		Integer[] num= {3, 2, 11, 4, 6, 7};

     // Convert the array to a list
		List<Integer> ls =new ArrayList<Integer>(Arrays.asList(num));
     // Sort the list in descending order
		Collections.sort(ls,Collections.reverseOrder());
	// The second largest number is now at index 1
		Integer num1 = ls.get(1);
		System.out.println(num1);
		   

	}

}
