package OCTOBER;

public class O23 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n=5;
		for(int i=1;i<=n;i++)
		{
			for(int j=1;j<=n-i;j++)
			{
				System.out.print(" ");
			}
			int b=1;//3
			for(int j=1;j<=2*i-1;j++)////	1,2,3,4,5,6,7
			{
				System.out.print(b);
				if(j<i)
				{
					b++;
				}
				else {
					b--;
				}
			}
			System.out.println();

		}

	}

}
