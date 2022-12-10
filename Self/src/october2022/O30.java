package october2022;

public class O30 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n=5;
		for(int i=1;i<=n;i++)
		{
			for(int j=1;j<=n-i;j++)
			{
				System.out.print(" ");
			}
			
			int c=1;
			for(int j=1;j<=2*i-1;j++)
			{
				
				System.out.print((char)(c+64));
				
				if(j<i)
				{
					c++;
				}
				else
					c--;
				
			}
			System.out.println();
		}
	}

}
