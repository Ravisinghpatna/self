
public class O11 {
	public static void main(String[] args) {
		int n=5;
		int num=1;
		 
		for(int i=1;i<=n;i++)
		{
			
			for(int j=1;j<=n;j++)
			{
				System.out.print(num+ " ");
				if(num>=9)
				{
					num=0;
				}
				num++;
				
			
			}
			System.out.println();

		}
	}
	
	}
