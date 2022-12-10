package Day25;

public class ReverseHelloWorld {

	public static void main(String[] args) {
		String str="HELLO WORLD";
		String ar[]=str.split(" ");
		for(int i=ar.length-1;i>=0;i--)
		{
			System.out.print(ar[i]+ " " );
		}
		
		
	}

}
