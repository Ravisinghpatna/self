package Date_2_Dec;

public class Print1_13 {

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
				System.out.print(x);
				x++;
			}
			System.out.println();
		}

	}

}
