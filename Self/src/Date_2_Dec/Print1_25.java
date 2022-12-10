package Date_2_Dec;

public class Print1_25 {

	public static void main(String[] args) {
		int n=5;
		
		for(int i=1;i<=n;i++)
		{
			int x=i;
			for(int k=1;k<=n;k++)
			{
			System.out.print(x);
				x++;
				if(x>5)
				{
					x=1;
				}
				
			}
			System.out.println();
		}

	}

}
