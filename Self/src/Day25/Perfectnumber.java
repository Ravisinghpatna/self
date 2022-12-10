package Day25;

public class Perfectnumber {

	public static void main(String[] args) {
		int count=0;
		int n=28;



		for(int i=1;i<n;i++)
		{
			if(n%i==0)
			{
				count=count+i;
				System.out.print(i+" ");
			}

		}
		
		
		if(n==count)
		{
			System.out.println("perfect no");
		}
		else
			System.out.println("not perfec");
	}

}
