import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;

public class RemoveDuplicates {
   
	
	
	
	public static void main(String[] args) {
		 int[] a = {1,2,3,3,5,6,6,7};
		 removeDuplicates(a);
	}

	private static void removeDuplicates(int[] a) {
		Set<Integer> set= new LinkedHashSet<Integer>();
		 for(int i:a) {
			 set.add(i);
			 
			 
		 }
		 System.out.println(set);
		
		
	}

}
