package OCTOBER;

public class P1 {

	public static void main(String[] args) {
		int n=121,sum=0;
		int temp=n;
		while(n!=0)
		{
			int a=n%10;
			sum=sum*10+a;
			n=n/10;
		}
		if(temp==sum)
		{
			System.out.println("palindrome No");
		}
		else
			System.out.println("Not Palindrome");
		

	}

}
