package testYantra;

public class PrimeNoRange {

	static boolean isPrime(int x)
	{
		for(int i=2;i<=x/2;i++)
		{
			if(x%i==0)
				return false;  
		}
		return true;
	}

	public static void main(String[] args) {

		for(int i=1;i<=100;i++)
		{
			if(isPrime(i))
			{
				System.out.print(i+" ");
			}
		}
		System.out.println();
	}

}
