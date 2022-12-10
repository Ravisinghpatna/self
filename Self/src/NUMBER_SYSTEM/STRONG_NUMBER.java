package NUMBER_SYSTEM;
import java.util.Scanner;

public class STRONG_NUMBER {
	
	static boolean isStrong(int num) {

		int sum=0;
		int result=num;

		while(num!=0)
		{
			int fact=1;
			int n=num%10;
			for(int i=1;i<=n;i++)
			{
				fact=fact*i;
				
			}
			num=num/10;
			sum=sum+fact;

		}
		
//		System.out.println(sum);
//
//		if(result==sum)
//		{
//			System.out.println("STRONG NUMBER");
//
//		}
//		else
//			System.out.println("NOT STRONG NUMBER");

		if(result==sum)
			return true;
		else
			return false;
	}

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("CHECK THE NO IS STRONG OR NOT");
		int	num=sc.nextInt();
		int count=0;
		
		for(int i=1; i<=num; i++)
		{
			if(isStrong(i)==true)
			{
				System.out.println(i);
				count++;
			}
		}
		System.out.println("Number of strong numbers --> "+count);
	}

}
