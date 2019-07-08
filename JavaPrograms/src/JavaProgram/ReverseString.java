package JavaProgram;

public class ReverseString {

	public static void main(String[] args) {

String str="gdgdfgfghh";
String rev="";

int len= str.length();

for (int i=len-1;i>=0;i--)

	rev=rev+str.charAt(i);	

System.out.print("Reverse of a string is :"+rev);

	}

}
