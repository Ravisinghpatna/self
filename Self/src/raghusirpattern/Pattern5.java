package raghusirpattern;

public class Pattern5 {

	public static void main(String[] args) {

		int n=5;
		for(int i=1;i<=n;i++)
		{
			int x=1;
			for(int j=1;j<=n-i;j++)
			{
				System.out.print(" ");
			}
			for(int j=1;j<=2*i-1;j++)
			{
				System.out.print(i%2);
			}
			System.out.println();
			
			
		}
	}

}