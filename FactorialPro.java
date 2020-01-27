package test;

public class FactorialPro {

	public static void main(String[] args) {
	  int n=5;
	  int fact=1;
	   
	  while(n>1) {
		  fact*=n;
		  n-=1;
	  }
	  
	  System.out.println(fact);
	}

}
