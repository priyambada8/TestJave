import java.util.HashSet;
import java.util.Set;

public class DuplicateEle {

	public static void main(String[] args) {
		String str = "Java is is a progrm";
		String[] s2 = str.split(" ");
		
		 //  char[] ch = str.toCharArray();
	     Set<String> s = new HashSet<>();
	      for(String s3:s2) {
		   if(s.add(s3) == false) {
			 System.out.print(s3+" ");
		   }
			 
	      }
		
	

	}

}
