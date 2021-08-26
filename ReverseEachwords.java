
public class ReverseEachwords {

	public static void main(String[] args) {
		String str = "java is a prog lang";
		String str2 = " ";
		String[] a = str.split(" ");
		for (int i = a.length-1; i>=0; i--  ) {
			
			str2 = str2+a[i]+" ";
			
		}
      System.out.println(str2);
	}

}
