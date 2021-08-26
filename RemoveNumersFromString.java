
public class RemoveNumersFromString {

	public static void main(String[] args) {
		String s = "Habc123java@!!";
		String s2= "";
		//remove all integer & special character
		 s2=s2+ s.replaceAll("[^A-Za-z]","");
		 System.out.println(s2);
		 //remove all integer
		 String s3=s.replaceAll("\\d","");
		 System.out.println(s3);
		 
		 //remove all characters & keep integer
		String s4= s.replaceAll("[^0-9]","");
	    System.out.println(s4);
		 
		 
		

	}

}
