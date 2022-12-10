package Date_2_Dec;

import java.util.Scanner;

public class CubeInmethod {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the no");
		
		int n = sc.nextInt();		
		System.out.println(cubeRoot(n));
		

		
//		int sq = cubeRoot(n);
//		System.out.println(sq);
	}
	
	public static int cubeRoot(int n)
	{
	
		int cube = n*n*n;
		return cube;
		
	}
	
}
