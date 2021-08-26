
public class test {

	public static void main(String[] args) {
		String s= "Test Automation";
		  String[] str = s.split("");
		  for(int i=0; i<str.length;i++){
		   char[] ch= str[i].toCharArray();
		   for(int j=ch.length-1; j>=0; j--){
		    System.out.println(ch[j]);
		       
		    }
		 }

	}

}
