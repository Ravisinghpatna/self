package october2022;

public class O44 {

	public static void main(String[] args) {
		int n=11;
		for(int i=1;i<=n;i++)
		{
			for(int j=1;j<=n;j++)
			{
				if(i==1||i==n||j==1||j==n||j==i||i+j==n+1)
				{
					System.out.print("*  ");
				}
				else
					System.out.print("   ");
			}
			System.out.println();
		}
	}
}


	
