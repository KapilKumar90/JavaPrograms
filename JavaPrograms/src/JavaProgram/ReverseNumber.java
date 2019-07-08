package JavaProgram;

import java.util.Scanner;

public class ReverseNumber {

	public static void main(String[] args) {
 int rem,rev=0;
 //reverse number
@SuppressWarnings("resource")
Scanner scr= new Scanner(System.in);
int n=scr.nextInt();
while(n>0)
{
	rem=n%10;
	rev=rev*10+rem;
	n=n/10;
}

System.out.println("Reverse number is:"+rev);
	}

	
		
	}


