package StringPractice;

import java.util.Scanner;

public class PalindromeNumbers {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);		System.out.println("enter the number ");
		int n = sc.nextInt();
		//int n=131;
		int rev=0;
		int original=n;
		while(n>0)
		{
			int a=n%10;
			rev=rev*10+n%10;
//			System.out.print(a);
			n=n/10;
		}
		if(original==rev)
		{
			System.out.println("  palindrome ");
		}
		else
		{
			System.out.println("  not palindrome");
		}

	}

}
