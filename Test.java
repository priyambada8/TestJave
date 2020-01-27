package test;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;



public class Test{
	public static void main(String[] args) {
		ArrayList<String> al = new ArrayList<>();
		al.add("java");
		al.add("django");
		al.add("java");
		al.add("tree");
		al.add("python");
		al.add("c++");
		al.add("python");
		System.out.println("arraylist values: "+al);
		
		
		//-------------find duplicate----
		
		Set<String> s = new HashSet<>();
		for(String name:al) {
			if(s.add(name)==false)
				System.out.println("duplicate values: "+name);
		}
		
		// --------remove duplicate words from string array------------
		Set<String> st = new HashSet<>(al);
		System.out.println("unique values: "+st);
		/*s.addAll(al);
		System.out.println("unique values are : "+s);*/
		
		
		 
		}
	 
	}


