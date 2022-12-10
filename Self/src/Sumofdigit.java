import java.util.Scanner;
public class Sumofdigit {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the Number");
		int n = sc.nextInt();//n=123=6;
		int x, sum=0;
		while(n>0)
		{
			x=n%10;
			sum=sum+x;
			n=n/10;
		}

		System.out.println(sum);//3+2+1=6






	}

}
