package raghusirpattern;

public class Pattern6_7 {

	public static void main(String[] args) {

		int n=5;
		for(int i=1;i<=n;i++)
		{
			
			for(int j=1;j<=n-i;j++)
			{
				System.out.print(" ");
			}
			int x=i;
			for(int j=1;j<=2*i-1;j++)
			{
				System.out.print(x%2);
				if(j<i)
				{
					x--;
				}
				else {
					x++;
				}
			}


//			for(int j=2;j<=i;j++) {
//				System.out.print(j);
//			}

			System.out.println();
		}
	}

}
