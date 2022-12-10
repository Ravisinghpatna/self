package OCTOBER;

public class O28 {
	public static void main(String[] args) {
		int n=5;
		for(int i=1;i<=n;i++)
		//for(int i=n;i>=1;i--)
		{
			for(int j=1;j<=n-i;j++)
			{
				System.out.print(" ");
			}
			int r=1;
			for(int j=1;j<=2*i-1;j++)
			{
				System.out.print(r);
//				
				if(j<i) {
					r++;
				}
				else
				{
					r--;
				}
				
			}
			System.out.println();
		}
	}

}
