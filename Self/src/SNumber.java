import java.util.Scanner;

public class SNumber {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the num");
		int r = sc.nextInt();
		int sum=0;
		int num=r;
		while(r>0)
		{
			int a=r%10;
			int fact = 1;
			for(int i=a;i>1;i--)
			{
				fact=fact*i;
			}
			sum=sum+fact;
			
			r=r/10;
		}
		
		if(sum==num)
		{
			System.out.println("Strong Number");
		}
		else
			System.out.println("Not Strong Number");
	}

}
