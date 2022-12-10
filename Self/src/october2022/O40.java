package october2022;

public class O40 {
public static void main(String []Ravi)
{
	
	int n=5;
	
	
	for(int i=1;i<=n;i++)
	{
		for(int j=1;j<=i-1;j++)
		{
			System.out.print(" ");
		}
		for(int j=i;j<=n;j++)
		{
			System.out.print((char)(j+64));
		}
		System.out.println();
	}
	
}
}
