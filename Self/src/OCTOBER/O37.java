package OCTOBER;

public class O37 {
	public static void main(String []Ravi)
	{
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
