package test;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

public class OccuranceDemo {

	public static void main(String[] args) {
		ArrayList<String> arraylist = new ArrayList<String>();
	    arraylist.add("Apple");
	    arraylist.add("Banana");
	    arraylist.add("Pear");
	    arraylist.add("Mango");
	    arraylist.add(2, "appy");

	    /*Unsorted List: ArrayList content before sorting*/
	    System.out.println("ArrayList Before Sorting:");
	    for(String str: arraylist){
	   System.out.println(str);
	  }

	    /* Sorting in decreasing (descending) order  , Collections.reverseOrder()*/
	    Collections.sort(arraylist, Collections.reverseOrder());
	   

	    /* Sorted List in reverse order*/
	    System.out.println("ArrayList in descending order:");
	    for(String str: arraylist){
	   System.out.println(str);
	    }
	
    
	}

}
