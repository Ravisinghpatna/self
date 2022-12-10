
public class Palindromenum {

	public static void main(String[] args) {
		int n=12321;
		int num=n;
		int count=0;
		
		
		while(n!=0)
		{		
			count=count*10+n%10;
			
			n=n/10;
		}
		System.out.print(count+" ");
		
		if(count==num)
		{
			System.out.println("palindrome no");
		}
		else
			System.out.println("not Palindrome");
		

	}

}
