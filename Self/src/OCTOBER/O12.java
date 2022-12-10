package OCTOBER;

public class O12 {
	public static void main(String[] args) {
		int x=5;
		for(int i=x;i>=1;i--)
		{
			for(int j=1;j<=i-1;j++)
			{
				System.out.print(" ");
				
			}
			for(int j=i;j<=x;j++)
			{
				System.out.print(j);
			}
			System.out.println();
		}
	}


}
