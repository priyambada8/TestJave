package test;

public class ReverseEachWords {

	public static void main(String[] args) {
		 String str="java program is";
		 String str1="";
		 
		 String[] a = str.split(" ");
		 
		/* for(int i=0; i<a.length; i++) {
			 System.out.print(a[i]+" ");
		
	       }
		 System.out.println();*/
		 
		 for(int j= a.length-1;j>=0;j--) {
			 str1=str1+a[j]+" ";
		 }
			 
		System.out.println(str1);
		 
	

}
}