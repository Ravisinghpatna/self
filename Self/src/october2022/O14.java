package october2022;

public class O14 {
	public static void main(String[] args) {
		int n=5;int num=1;
		for(int i=1;i<=n;i++)
		{

			for(int j=i;j<=n+i-1;j++)
			{ 
				
				System.out.print(num+" ");
				num++;
				if(num>9)
				{
					num=1;
				}
			}
			System.out.println();
			
		}



	}
}


