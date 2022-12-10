package string_Questions;

public class ReverseTheString {

	public static void main(String[] args) {
		String str = "Java";
		String[] s1 = str.split("");
		String s2 = "";
		
		
		for(int i=0;i<str.length();i++)
		{
			s2=s1[i]+s2;
			//s2=str.charAt(i)+s2;
		}
		System.out.println(s2);
	}

}
