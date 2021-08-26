
public class Max_SecondMaxNo {

	public static void main(String[] args) {
		int[] a= {10,20,31,52,32,77,2};
		int n=a.length;
		int temp;
		for(int i=0;i<a.length;i++) {
			for(int j=i+1;j<a.length;j++) {
				if(a[i]>a[j]) {
				temp=a[i];
				a[i]=a[j];
				a[j]= temp;
				}
			}
		}
		
		 System.out.println("Elements of array sorted in ascending order: ");    
	        for (int i = 0; i < a.length; i++) {     
	            System.out.print(a[i] + " ");   
	        }
		
		System.out.println("Largestno:"+ a[n-1]);
		System.out.println("2nd Largestno:"+a[n-2]);
	}

}
