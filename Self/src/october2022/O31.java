package october2022;

public class O31 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n=5;
		for(int i=n;i>=1;i--)
		//for(int i=1;i<=n;i++)
		{
			
			//for(int j=n;j>=n-i+1;j--)
			for(int j=n;j>=i;j--)
			{
				System.out.print(j);
			}
			System.out.println();
		}
	}

}
