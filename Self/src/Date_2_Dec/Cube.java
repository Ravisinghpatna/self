package Date_2_Dec;

import java.util.Scanner;

public class Cube {

	public static void main(String[] args) {


		int cube;

		Scanner sc=new Scanner(System.in);
		System.out.print("enter the number");
		int n = sc.nextInt();

		cube=n*n*n;

		System.out.print(cube);
	}

}
