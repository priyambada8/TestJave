package testArray;

public class EvenAndOddNumbers {

	public static void main(String[] args) {
	
		int a[]= {9,7,6,8};
		
		for(int i=0;i<a.length;i++) {
			if(a[i]%2 != 0) {
				System.out.println("odd Nos: "+a[i]);
			}
			
		}
		
		
		for(int i=0;i<a.length;i++) {
			if(a[i]%2 == 0) {
				System.out.println("even numbers :"+a[i]);
			}
			
		}
	}

}