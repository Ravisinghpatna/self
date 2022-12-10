
public class Strongnum {

	public static void main(String[] args) {
		int n=145;
		int num=n;
		int count=0;
		int sum=0;
		int	fact=1;
		
		
		//while(n!=0)
		
		for(int i=1;i<=n;i++)
		{
			count=count*10+n%10;
			
		fact=fact*n;
		
		
		}
		n=n/10;
		sum=sum+n;
		
		
	if(sum==num)
	{
		System.out.println("Strong No");
	}
	else System.out.println("not Strong No");

	}

}
