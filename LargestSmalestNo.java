package test;

import java.util.Scanner;

public class LargestSmalestNo {

	

	public static void main(String[] args) {

		/*
		 * int n, temp; Scanner s = new Scanner(System.in);
		 * System.out.print("Enter no. of elements you want in array(Minimum 2):"); n =
		 * s.nextInt(); int a[] = new int[n];
		 * System.out.println("Enter all the elements:"); for (int i = 0; i < n; i++) {
		 * a[i] = s.nextInt(); } for (int i = 0; i < n; i++) { for (int j = i + 1; j <
		 * n; j++) { if (a[i] > a[j]) { temp = a[i]; a[i] = a[j]; a[j] = temp;
		 * 
		 * 
		 * 
		 * } } } System.out.println("Largest: "+a[n-1]);
		 * System.out.println("2ndLargest: "+a[n-2]);
		 * 
		 */
		
		
		int [] a= {2,7,8,23,76,1,45,-12,-21};
		int max=a[0];
		int min =a[0];
		
		for (int i=1;i<a.length;i++)
		{
		     if(a[i]>max) {
					max=a[i];
				}else if(a[i]<min) {
					min=a[i];	
				}
				
			}
			
			System.out.println("max value is:"+max);
			System.out.println("min value is:"+min);
		}
		
		
	}

