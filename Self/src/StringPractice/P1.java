package StringPractice;

public class P1 {

	public static void main(String[] args) {
		
		
		int n=5;
		for(int i=1;i<=n;i++)
		{
			for(int j=1;j<=i-1;j++)
			{
				System.out.print(" ");
			}
			for(int k=i;k<=n;k++)
			{
				if(i%2!=0)
				{
					System.out.print("Z");
				}
				else
					System.out.print("0");
			}
			System.out.println();
		}
	}

}
