package october2022;

public class Java {

	public static void main(String[] args) {
		
		int n=7;
		for(int i=n;i>=1;i--)
		{
			for(int j=1;j<=i-1;j++)
			{
				System.out.print(" ");
			}
			for(int j=n;j>=i;j--)
			{
				System.out.print(j);
			}
			System.out.println();
		}
	}

}
