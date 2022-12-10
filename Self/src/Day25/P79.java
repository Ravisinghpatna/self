package Day25;

public class P79
{
public static void main(String[] args) {
	int n=5;
//	for(int i=n;i>=1;i--)
//	{
//		for(int j=1;j<=n-i;j++) 
//		{
//			System.out.print(" ");
//		}
//		for(int k=i;k>=1;k--)
//		{
//			System.out.print("*");
//		}
//		System.out.println();
	
	 	for(int i=1;i<=n;i++)
	 	{
		for(int j=1;j<=i-1;j++)
		{
			System.out.print(" ");
		}
		for(int k=i;k<=n;k++)
		{
			System.out.print("*");
		}
		System.out.println();
	}
	{
		
	}
}
}
