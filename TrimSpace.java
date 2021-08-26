
public class TrimSpace {

	public static void main(String[] args) {
		String str = "      Geeks     for    Geeks        ";
	       
        // Call the replaceAll() method
        str = str.replaceAll("\\s{3}", "");
       
        System.out.print(str);
		
	}
	

	

}
