package NUMBER_SYSTEM;

public class PALINDROME_NUMBER {

	public static void main(String[] args) {
		int n=16461;
		int palindrome=n;
		int rev = 0;
		
		while(n>0)
		//for(int i=palindrome;i>0;i++)
		{
//			int x=n%10;
//			System.out.print(x);
			rev=rev*10+n%10;
			n=n/10;
		}
		if(rev==palindrome)
		{
		 System.out.println(" PALINDROME ");
		}
		else
			System.out.println(" NOT PALINDROME ");
	}

}






