package Day25;

public class PrimeNo {

	public static void main(String[] args) {
		int n=12,count=0;
		for(int i=1;i<=n;i++)
		{
			if(n%i==0)
			{
				count++;
			}
		}
		if(count==2)
		{
			System.out.println("the number is prime");
		}
		else
			System.out.println("the number is not prim");

	}

}
