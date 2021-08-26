
public class ReverseEachCharInWords {

	public static void main(String[] args) {
		String s = "This is my world";
		String[] strArry = s.split(" ");
		
		
        for(int i=0;i<strArry.length;i++) {
			
			char[] ch = strArry[i].toCharArray(); 
			
			for(int j= ch.length-1;j>=0;j--) {
			  
				System.out.print(ch[j]);
				
			}
			
			System.out.print(" ");
			
		}
	}

}
