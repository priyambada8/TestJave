package collection.programs;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;

import java.util.Map;
import java.util.Set;

public class ConvetMapToArrayList {

	public static void main(String[] args) {
		Map<String,Integer> map =new HashMap<>();
		map.put("Ram", 10);
		map.put("Test", 11);
		map.put("mars", 21);
		//Finding the Set of keys from the HashMap
		
		Set<String> setKeys= map.keySet();
		//Creating an ArrayList of keys by passing the keySet
		
		ArrayList<String> listOfKeys= new ArrayList<String>(setKeys);
		System.out.println("The Keys of the map is : "+listOfKeys);
		
		//Getting Collection of values from HashMap
		Collection<Integer> c= map.values();
		ArrayList<Integer> listOfValues = new ArrayList<>(c);
		System.out.println("The values of the map are convetred to arrayList :"+listOfValues);
		
		
		
        
	}

}
