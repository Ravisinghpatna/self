package StringPractice;

public class Print_Count_Digit {

	public static void main(String[] args) {
		
		long n=1256565600;
		int count=0;
		while(n!=0)
		{
			long x=n%10;
			count++;
			n=n/10;
		}
		
		System.out.println(count);
	}

}
