package test;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class OccuranceOfNumbers {

	public static void main(String[] args) {

		int a[]= {2,7,9,9,3,2,2,10,7,6};
		Map<Integer,Integer> map= new HashMap<>();
		
		for(int x:a) {
			if(map.containsKey(x)) {
				map.put(x,map.get(x)+1);
			}else {
				map.put(x,1);
			}
		}
     System.out.println(map);
	}
	

}
