package testYantra;

public class Palindrome {

	public static void main(String[] args) {
		int n=12231,z=n, sum=0;
		while(n!=0)
		{
			int a=n%10;
			sum=sum*10+a;
			n=n/10;
		}
		if(sum==z)
		{
			System.out.println("Palindrome");
		}
		else
		{
			System.out.println("Not Palindrome");
		}
		

	}

}
