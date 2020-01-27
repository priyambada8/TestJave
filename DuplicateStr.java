package test;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

public class DuplicateStr {
	public static void main(String[] args) {
		
		
		  /*String str="priyapyui"; 
		  int count=0; 
		  for(int i=0;i<str.length();i++) 
		  {
		  
			  for(int j=i+1;j<str.length();j++) 
		  
			    { 
				  if(str.charAt(i)==str.charAt(j)) {
				  System.out.println(str.charAt(j)); 
		          count++; 
			  } 
		 
			  }
		  }
		 
     
		 String names[]={"java","javscript","Java","Rubby"};
		Set<String> store = new HashSet<String>();
		
		for(String name:names)
		{
			 //System.out.println(store.add(name));  
		 if(store.add(name))
		 {
			 System.out.println("duplicate ele is:"+name);
		} 
		
		 
		}*/
		
	/*	ArrayList<Integer> al = new ArrayList<>();
		al.add(1);
		al.add(2);
		al.add(5);
		al.add(2);
		al.add(6);
		al.add(3);
		al.add(1);
		System.out.println("arraylist values"+al);
		
		Set<Integer> set = new HashSet<>();
		set.addAll(al);
		
		System.out.println("unique values"+set);*/

		ArrayList<String> al = new ArrayList<>();
		al.add("java");
		al.add("add");
		al.add("java");
		al.add("tree");
		al.add("python");
		al.add("c++");
		al.add("python");
		System.out.println("arraylist values: "+al);
		
		Set<String> s = new HashSet<>();
		for(String name:al) {
			
			if(s.add(name)==false)
				System.out.println(name);
			
		}
		
		
		
	}
	}
	


