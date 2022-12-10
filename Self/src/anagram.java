import java.util.Arrays;

public class anagram {

	public static void main(String[] args) {

		String  s1 = "doog";
		String  s2="gooday";



		s1=s1.toLowerCase();
		s2=s2.toLowerCase();

		char []ch=s1.toCharArray();
		char [] ch1=s2.toCharArray();

		if(ch.length!=ch1.length)
		{
			System.out.println("It's not a anagram");
			return;
		}
		Arrays.sort(ch);
		Arrays.sort(ch1);

		boolean result = Arrays.equals(ch, ch1);

		if(result)
		{
			System.out.print("Anagram "+s1+" "+s2);
		}
		else
		{
			System.out.print("not Anagram "+s1+" "+s2);
		}

	}

}
