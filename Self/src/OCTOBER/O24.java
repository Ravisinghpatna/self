package OCTOBER;

public class O24 {

	public static void main(String[] args) {
		int n=5;
		for(int i=n;i>=1;i--)
		{
			for(int j=1;j<=n-i;j++)
			{
				System.out.print(" ");
			}
			int b=i;
			for(int j=1;j<=2*i-1;j++)////	1,2,3,4,5,6,7
			{
				System.out.print(j);
				if(j<i)
					b--;
				else
					b++;
			}
			System.out.println();
		}
		for(int i=2;i<=n;i++)
		{
			for(int j=1;j<=n-i;j++)
			{
				System.out.print(" ");
			}
			int b=i;
			for(int j=1;j<=2*i-1;j++)////	1,2,3,4,5,6,7
			{
				System.out.print(j);
				if(j<i)
					b--;
				else
					b++;
			}
			System.out.println();
		}
	}
}
