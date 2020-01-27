package test;

import java.util.HashMap;
import java.util.Map;

public class OccuranceDemo2 {

	public static void main(String[] args) {
	
		String str="proggramtrm";
		Map<Character,Integer> map= new HashMap<>();
		char[] ch=str.toCharArray();
		for(char c:ch) {
			if(map.containsKey(c)) {
				map.put(c,map.get(c)+1);
			}else {
				map.put(c,1);
			}
		}
     System.out.println(map);
	}

}
