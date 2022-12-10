package testYantra;

public class String_Palindrome11 {

	public static void main(String[] args) {
		String s="madam";
		String[] s1=s.split("");
		String s2="";
		
		for(int i=0;i<s1.length;i++)
		{
			s2=s1[i]+s2;
		}
		//System.out.println(s2);
		if(s2.equals(s))
		{
			System.out.println("Palindrome");
		}
		else
			System.out.println("Not Palindrome");
		
		
		
		
	}

}
