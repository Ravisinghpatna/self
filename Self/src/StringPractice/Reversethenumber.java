package StringPractice;

import java.util.Scanner;

public class Reversethenumber {

	public static void main(String[] args) {
		int n;
		int sum=0;
		Scanner sc=new Scanner (System.in);
		System.out.println("Enter the number");
		n=sc.nextInt();
		int temp=n;
		while(n>0)
		{
			int x=n%10;
		 sum = sum*10+x;
			//System.out.println(x);

			n=n/10;
			
		}
		//System.out.println(sum);
		if(temp==sum)
		{
			System.out.println("palindrome");
		}
		else
			System.out.println("not");
	}

}
