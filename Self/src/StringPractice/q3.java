package StringPractice;

public class q3 {

	public static void main(String[] args) {

		int x=18, count=0;
		for(int i=1; i<=x; i++)
		{
			if(x%i==0)
			{
				count++;
			}				
		}
		if(count==2)
		{
			System.out.println(x+" is Prime");
		}
		else
		{
			System.out.println(x+" is not prime");
		}
		
		int y=19, count1=0;
		for(int i=1; i<=y; i++)
		{
			if(y%i==0)
			{
				count1++;
			}				
		}
		if(count1==2)
		{
			System.out.println(y+" is Prime");
		}
		else
		{
			System.out.println(y+" is not prime");
		}
		
	}

}
