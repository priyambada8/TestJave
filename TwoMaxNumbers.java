package test;

public class TwoMaxNumbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int max1=0;
		int max2=0;
		
		int num[] = {5,34,2,45,1,99,23,235};
		for(int i=0;i<num.length;i++) {
			if(max1<num[i]) {
				max2=max1;
				max1=num[i];
			}else if(max2<num[i]) {
				max2=num[i];
				
			}
		}
		System.out.println("First Max Number: "+max1);
        System.out.println("Second Max Number: "+max2);
	}

}
