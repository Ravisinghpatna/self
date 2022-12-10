package Date_2_Dec;

public class StrongNo {

	public static void main(String[] args) {

		int n=145, num=n, sum=0;
		
		
		while(n!=0)
		{	int fact=1;
			
			int b=n%10;
			for(int i=1;i<=b;i++)
			{
				fact=fact*i;  //1 2 6 24 120	
			}
			sum=sum+fact;	
			n=n/10;

		}
		if(num==sum)
		{
			System.out.println("StrongNo");
		}
		else
			System.out.println("Notstrong");


	}

}
