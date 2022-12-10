package Day25;

import java.util.Scanner;

public class PP5 {

	public static void main(String[] args) {
		String rev ="";
		String str="SPIDERS";
		int leng=str.length();

		for(int i=leng-1;i>=0;i--)
		{
			rev=rev+str.charAt(i);
		}
		System.out.println(rev);

	}

}
