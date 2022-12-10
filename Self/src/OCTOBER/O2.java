package OCTOBER;

public class O2 {

	public static void main(String[] args) {
		int x=5;
		for(int i=x;i>=1;i--)
		{
			for(int j=x;j>=x-i+1;j--)
			{
				System.out.print("*"+" ");
			}
			System.out.println();
		}

	}

}
