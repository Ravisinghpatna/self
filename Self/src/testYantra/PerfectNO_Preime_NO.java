package testYantra;

public class PerfectNO_Preime_NO {

	public static void main(String[] args) {

		int n=496, sum=0; //6 28 496

		for(int i=1;i<n;i++)
		{

			if(n%i==0)
			{
				sum=sum+i;
			}
		}

				if(sum==n)
			{
				System.out.println("Perfect");
				}
				else
				{
					System.out.println("not Perfec");
			}

		//		for(int i=1;i<=n;i++)
		//		{
		//			if(n%i==0)
		//			{
		//				sum++;
		//			}
		//		}
		//		if(sum==2)
		//		{
		//			System.out.println("prime");
		//		}
		//		else
		//			System.out.println("Not Prime");
	}

}
