package october2022;

public class O10 {
	public static void main(String[] args) {
		int n=5;
		for(int i=1;i<=n;i++)
		{
			for(int j=i;j<=n+i-1;j++)
			{
				System.out.print(j%2);
			}
			System.out.println();
		}
	}

}
