package StringPractice;
public class q1 {
	public static void main(String[] args) {
		int n=10,ravi=0;

		for(int i=1; i<=n; i++)
		{
			int count=0;
			for(int j=1;j<=i;j++)
			{
				if(i%j==0)
				{
					count++;
				}
			}
			if(count==2)
			{
				System.out.println(i);
				ravi++;
			}
		}
		System.out.println();
		System.out.println("Total number of prime numbers : "+ravi);
	}
}