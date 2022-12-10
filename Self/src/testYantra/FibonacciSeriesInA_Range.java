package testYantra;

import java.util.Scanner;

public class FibonacciSeriesInA_Range {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number");
		int n=sc.nextInt();
//		int n=5;
		int x=0,y=1,z;
		for(int i=1;i<=n;i++)
		{
			System.out.print(x+" ");
			z=x+y;
			x=y;
			y=z;
		}

	}

}
