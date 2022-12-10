package testYantra;

public class HappyNumber {

	public static void main(String []Ravi) {
		int x=9089;
		
		while(x>=10)
		{
			int sum=0;
			while(x>0)
			{
				int b=x%10;
				sum=sum+b*b;
				x=x/10;
			}
			x=sum;
		}
	if(x==1||x==7)
	{
		System.out.println(" Happy number ");
	}
	else
		System.out.println(" Is not Happy number ");
}

}
