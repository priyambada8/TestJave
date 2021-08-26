
public class ConvertEachFirstLetter {

	public static void main(String[] args) {
		String s ="java is a good program";
		String newString="";
		String[] words = s.split(" ");
		for(String word:words ) {
			String firstletter = word.substring(0, 1);
            String remainingLetter =  word.substring(1);
             
			//System.out.println(remainingLetter);
            newString= newString+ firstletter.toUpperCase()+remainingLetter+" ";
         
			
		}
		
		 System.out.println(newString);

	}

}
