
import java.util.Scanner;
public class RevreseTheString {

	public static void main(String[] args) {
		Scanner sc=new Scanner (System.in);
		System.out.println("Enter the name");
		String str = sc.nextLine();
		// str="Ravi singh";
		String ar[]=str.split("");
		
		for(int i=ar.length-1;i>=0;i--)
		{
			System.out.print(ar[i]+"" );
		}

	}

}
