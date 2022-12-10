package october2022;

import java.util.Scanner;

public class OO7 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the value of n");
		int n=sc.nextInt();
		
		
		
		for(int i=1;i<=n;i++)
		{
			for(int j=1;j<=10;j++)
			{
				System.out.print(j+"*"+i+"="+i*j);
				System.out.println();
			}
			System.out.println();
		}
		
			
		}

	}


