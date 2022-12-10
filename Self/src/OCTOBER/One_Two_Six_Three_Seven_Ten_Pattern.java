package OCTOBER;

public class One_Two_Six_Three_Seven_Ten_Pattern {

	public static void main(String[] args) {
		int n=5;
		for(int i=1;i<=n;i++)
		{
			int x=i;
			for(int j=1;j<=i;j++)
			{
				System.out.print(x+" ");
			
				x=x+n-j;
			}
			System.out.println();
		}
	}

}
