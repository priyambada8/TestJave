import java.util.LinkedList;
import java.util.List;

public class FromListToArray {
	public static void main() {
	
	List<String> l= new LinkedList<String>();
	l.add("som");
	l.add("test");
	l.add("demo");
	l.add("test2");
	String[] stringArray = new String[l.size()];
	stringArray = l.toArray(stringArray);
	
	for(String value :stringArray )
	{
	    System.out.println(value);
	}
   
	}
       
}
