package JavaProgram;

public class Pattern4 {

	public static void main(String[] args) {
		int i,j,k,l;

		for(i=1;i<=4;i++)
		{

			for(j=1;j<=i;j++) 
			{
				System.out.print("*");

			}

			System.out.println();

		}
		for(k=1;k<=3;k++)
		{

			for(l=3;l>=k;l--) 
			{
				System.out.print("*");

			}
			System.out.println();
		}
	}

}
