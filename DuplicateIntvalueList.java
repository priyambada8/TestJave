package test;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

public class DuplicateIntvalueList {

	public static void main(String[] args) {
		ArrayList<Integer> al = new ArrayList();
		al.add(3);
		al.add(30);
		al.add(70);
		al.add(30);
	//ystem.out.println(al);
		
		Set<Integer> set = new HashSet<>();
		// remove duplicate integer
//   System.out.println(set);
		
		//find duplicate int value from list
		
for(int a:al) {
			
			if(set.add(a)== false) {
	
				System.out.println(a);
		}

			
		}
		
		


	}


}