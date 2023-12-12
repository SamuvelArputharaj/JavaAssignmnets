package week4.day1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class SortingUsingCollectionListPrintReverseOrder {

	public static void main(String[] args) {
		
		 // Declare a String array and add the values
	    String[] companies = {"HCL", "Wipro", "Aspire Systems", "CTS"};
	    
	    // Add the collection to a list
	   List<String>cmpylist =new ArrayList<String>(Arrays.asList(companies));
        Collections.sort(cmpylist);
		System.out.println(cmpylist);
		for (int i =cmpylist.size()-1;i>=0;i--) {
			System.out.println(cmpylist.get(i));
		}
		
		//Without loop statement
		Collections.sort(cmpylist,Collections.reverseOrder());
		System.out.println(cmpylist);
		
	}

    
     
}
