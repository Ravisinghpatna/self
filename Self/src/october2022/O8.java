package october2022;

public class O8 {
	public static void main(String[] args) {
		int n=5;
		for(int i=1;i<=n;i++)
		{
			for(int j=1;j<=i;j++)
			{
				System.out.print((char)(96+i));
			}
			System.out.println();
		}

}
}
