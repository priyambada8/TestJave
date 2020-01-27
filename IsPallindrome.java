package test;

public class IsPallindrome {

	public static void main(String[] args) {
		String s="jvj",s3 ="";
		
		
		for(int i=s.length()-1;i>=0;i--) {
			s3=s3+s.charAt(i);
	
			 
			 
			 //System.out.print(s3);
		}
		
		
		if(s.equals(s3)) {
			System.out.println("pallindrome");
		}else {
			System.out.println("Not a pallindrome");	
		}
	}

}
