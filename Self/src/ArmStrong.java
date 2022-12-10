
public class ArmStrong {

	public static void main(String[] args) {

		int n=373;
		int sum = 0;
		int temp=n;//temp=371
		
		int pow=0;				//pow=3
		while(n>0)
		{
			pow++;
			n=n/10;
		}//n=0
		
		n=temp;//temp=371		n=371
		while(n>0)
		{
			int b = n%10;//b=7
			int value=1;//7 49 343
			
			for(int i=1; i<=pow; i++)
			{
				value=value*b;
			}
			
			sum=sum+value;
			
			n=n/10;
		}
		
		
		if(sum==temp)
			System.out.println("armstrong");
		else
			System.out.println("not armstrong");
	}

}
