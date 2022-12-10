
public class Print10To30 {

	public static void main(String[] args) {
		int x=10,y=30;
		
		
//		for(int i=x;i<=y;i++)
//		{
//			if(i%2==0)
//			System.out.println(i);
//			
//		}

//		while(x<=y)
//		{
//			if(x%2==0)
//			{
//				System.out.println(x);
//			}
//			x++;
//		}

		do
		{
			if(x%2==0)
			{
				System.out.println(x);
			}
			x++;			
		}
		while(x<=y);
	}

}
