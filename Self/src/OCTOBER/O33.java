package OCTOBER;

public class O33 {

	public static void main(String[] args) {
		int n=5;

		//		for(int i=1;i<=n;i++)
		//		{
		//		for(int j=1;j<=n-i;j++)
		//		{
		//			System.out.print(" ");
		//		}
		//		int x=i;
		//		for(int j=i;j<=3*i-2;j++)
		//		{
		//			System.out.print(x%2);
		//			if(j<i) {
		//				x--;}
		//				else {
		//					x++;
		//				}
		//			}
		//		System.out.println();
		//		}
		//		
		//		}
		//
		//	}

		for(int i=1;i<=n;i++)
		{
			for(int j=1;j<=n-i;j++)
			{
				System.out.print(" ");
			}
			int x=i;
			for(int j=1;j<=2*i-1;j++)
			{
				System.out.print(x%2);
				
				if(j<i) {
					x--;}
				else {
					x++;
				}
			}
			System.out.println();
		}

	}

}



