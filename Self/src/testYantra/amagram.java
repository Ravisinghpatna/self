package testYantra;

import java.util.Arrays;

public class amagram {

	public static void main(String[] args) {
		String 	s="irva";
		String 	s2="raviu";

		char[] c = s.toCharArray();
		char[] c2=s2.toCharArray();

		if(s.length()!=s2.length())
		{
			System.out.println("it is not anagram");
			return;
			
		}
			Arrays.sort(c);
			Arrays.sort(c2);

			boolean result = Arrays.equals(c, c2);
			if(result)
			{
				System.out.println(s+" "+s2+" "+"anagram");
			}
			else
			{
				System.out.println(s+" "+s2+" "+"Not anagaram");
			}
		
//		else
//			System.out.println(s+" "+s2+" "+"Not anagaram");	


	}

}
