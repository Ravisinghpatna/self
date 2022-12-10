package OCTOBER;

public class O5 {

	public static void main(String[] args) {
		int x=5;
		for(int i=1;i<=x;i++)
		{
			for(int j=1;j<=x-i+1;j++)
			{
				System.out.print(j%2);
			}
			System.out.println();
		}
	}

}
