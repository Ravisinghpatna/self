package october2022;

public class OO3 {

	public static void main(String[] args) {
		int n=5;
		for(int i=1;i<=n;i++)
		{
			for(int j=1;j<=n-i;j++)
			{
				System.out.print(" ");
			}
			int x=i;
			for(int j=i;j>=1;j--)
			{
				System.out.print(x);
				x++;
				
			}
			System.out.println();
		}
	}

}
