package Day25;

public class P70 {
public static void main(String[] args) {
	int  n=5;
	for(int i=n;i>=1;i--)
	{
		for(int j=n;j>=n-i+1;j--)
		{
			System.out.print(i);
		}
		System.out.println();
	}
}
}
