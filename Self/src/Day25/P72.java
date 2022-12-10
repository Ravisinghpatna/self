package Day25;

public class P72 {
public static void main(String[] args) {
	int n=5;
	for(int i=1;i<=n;i++)
	{
		for(int j=1;j<=n-i+1;j++)
		{
			System.out.print(j%2+" ");
		}
		System.out.println();
	}
}
}
