package testYantra;

public class Number_Palindrome {

	public static void main(String[] args) {
		int n=12331, x=n, sum=0;
		
		while(n!=0)
		{
			int a=n%10;
			sum=sum*10+a;
			n=n/10;
		}
		if(x==sum)
		{
			System.out.println("Palindrome  "+sum);
		}
		else
		{
			System.out.println("Not Palindrome "+sum);
		}
	}

}
