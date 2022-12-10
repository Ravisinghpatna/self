package OCTOBER;

public class O27 {

	public static void main(String[] args) {
		int n=5;
		for(int i=1;i<=n;i++)
		{
			for(int j=1;j<=i-1;j++)
			{
				System.out.print(" ");
			}
			int x=i;
			for(int j=i;j<=2*n-i;j++)
			{
				System.out.print((char)(x+64));
				if(j<n)
					x++;
				else
					x--;
			}
			System.out.println();
		}

	}

}
