package raghusirpattern;

public class Pattern1_2 {

	public static void main(String[] args) {

		int n=5; 
		for(int i=1;i<=n;i++)
		{
			int x=1;
			for(int j=1;j<=n-i;j++)
			{
				System.out.print("  ");
			}
			for(int j=1;j<=i;j++)
			{
				System.out.print(j+" ");
				if(j<i)
				{
					x++;
				}
				else {
					x--;
				}
			}
			
			for(int j=2;j<=i;j++)
			{
				System.out.print(x+" ");
				if(j<i)
				{
					x--;
				}
				else {
					x++;
				}

			}
			System.out.println();
				}
		
	}

}
