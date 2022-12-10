package october2022;

public class O43 {

	public static void main(String[] args) {
		int n=5;
		for(int i=1;i<=n;i++)
		{
			for(int j=n;j>i;j--)
			{
				System.out.print(" ");
			}
			//int x=i;
			
			for(int j=i;j<=3*i-2;j++)
			{
				System.out.print(j%2);
				//x++;
			}
			System.out.println();
		}

	}

}
