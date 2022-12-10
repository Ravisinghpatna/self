package StringPractice;

import java.util.Scanner;

public class q2 {

	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter any range");
		int n=sc.nextInt();
		
		for(int i=1; i<=n; i++)
		{
			String result = isPrime(i);
			System.out.println(i+" is "+result);
		}			
		
	}
	
	static String isPrime(int x) 
	{
		int count=0;
		for(int i=1; i<=x; i++)
		{
			if(x%i==0)
				count++;				
		}
		if(count==2)
			return "prime";
		else
			return "not prime";
	}
	

}
