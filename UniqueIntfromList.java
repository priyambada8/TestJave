import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class UniqueIntfromList {

	public static void main(String[] args) {
		ArrayList<Integer> intList= new ArrayList<>(Arrays.asList(2,1,1,4,5,5,6,7));
		System.out.println("Input List: "+intList);
		
		Map<Integer,Integer> map = new HashMap<Integer,Integer>();
	    for(int v :intList) {
			
			if(map.containsKey(v)) {
				map.put(v,map.get(v)+1);
			}else {
				map.put(v, 1);
			}
			
		}
	 System.out.println("get the count by using Map: "+map);
		 
	   List<Integer> l = new ArrayList<>();	
	  
	   for(int val2:intList) {
	    	if(map.get(val2)<2) {
	    		l.add(val2);
	    		
	   	}
	   
	  }
	   System.out.println("Output List: "+l);
		 
	}

}
