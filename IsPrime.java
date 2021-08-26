
public class IsPrime {

	public static void main(String[] args) {
		 int n=10;
	      int count = 0;
	      
	      
	      
	      for (int i=2;i<n-1;i++) {
	    	  
	    	  if(n%i==0) {
	    		  count= count+1;
	    	  }
	      }
	      
	      if(count==0) {
	    	  System.out.println(n +"  is a prime no");
	    	  
	      }else {
	    	System.out.println(n +" is not a prime");  
	      }
		
	}

}
