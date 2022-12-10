package october2022;

import java.util.Scanner;

public class OO1 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the value of the number");
		int n=sc.nextInt();
		for(int i=1;i<=n;i++)
		{
			System.out.print(i+" ");
			
		}
		System.out.println();
		for(int i=1;i<=n;i++)
		{
			System.out.print((char)(i+64)+" ");
		}
	}

}
