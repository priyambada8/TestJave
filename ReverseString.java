
public class ReverseString {

	public static void main(String[] args) {
		 String s= "priya";
		 //String s2 ="";
//				    char[] ch=  s.toCharArray();
//						   
//				    for (int i= ch.length-1;i>=0;i--){
//				        System.out.println(ch[i]);
//				       
				      String s2="";
				      for(int i=s.length()-1;i>=0;i--) {
				    	  s2=s2+s.charAt(i);
				     
				   }
				      System.out.println(s2);

	}
	
}

