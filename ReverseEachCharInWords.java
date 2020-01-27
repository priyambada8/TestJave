package test;

public class ReverseEachCharInWords {

	public static void main(String[] args) {
		String s ="java is a good program";
		String[] strArray= s.split(" ");
		for(String StrEle:strArray) {	
			System.out.println(StrEle);	
			System.out.println(strArray.length);
		}
		
		for(int i=0;i<strArray.length;i++) {
			
			char[] ch = strArray[i].toCharArray(); 
			
			for(int j= ch.length-1;j>=0;j--) {
			  
				System.out.print(ch[j]);
				
			}
			
			System.out.print(" ");
			
		}
		

	}

}
