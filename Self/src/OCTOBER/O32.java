package OCTOBER;

public class O32 {

	public static void main(String[] args) {
		int n=5;
		for(int i=n;i>=1;i--)
		{
			for(int j=1;j<=n-i;j++)
			{
				System.out.print(" ");
			}
			int x=i;
			for(int j=1;j<=2*i-1;j++)
			{
				System.out.print(x);
				
				if(j<i)
				{
					x--;
				}
				else
					x++;
				
			}
			System.out.println();
		}
	}

}
