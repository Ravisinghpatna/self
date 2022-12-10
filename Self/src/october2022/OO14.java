package october2022;

public class OO14 {

	public static void main(String[] args) {
		int n=5, num=1;
		for(int i=1;i<=n;i++)
		{
			for(int j=i;j<=2*i-1;j++)
			{
				System.out.print(num%2+" ");
				num++;
				
			}
			System.out.println();
		}
	}

}
