package JavaProgram;

import java.util.Scanner;

public class Fibbonacci {

	public static void main(String[] args) {
		
		int f1=0,f2=1,f3=0;
		
		System.out.println("Enter the Fibbonaci series number:");
		@SuppressWarnings("resource")
		Scanner scr= new Scanner(System.in);
		int n= scr.nextInt();

		System.out.println("Fibonaci series upto :"+n+" number");
		System.out.print(f1+","+f2);
		for(int i=2; i<n;i++) 
		{
			f3=f1+f2;
			System.out.print(","+f3);
		    f1=f2;
		    f2=f3;
			
		}
	
		
	}

}

