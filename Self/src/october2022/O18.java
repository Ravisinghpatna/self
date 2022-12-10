package october2022;

public class O18 {

	public static void main(String[] args) {
		int n=5; int num=1;
		for(int i=n;i>=1;i--)
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
