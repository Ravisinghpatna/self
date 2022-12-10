package Date_2_Dec;

public class PrimeNo {

	public static void main(String[] args) {
		
		int n=111;
		int count=0;
		
		for(int i=1;i<=n;i++)
		{
			if(n%i==0)
			{
			count++;
			}
		}
		if(count==2)
		{
			System.out.print("Prime No");
		}
		else
			System.out.print("Not Prime");
	}

}
