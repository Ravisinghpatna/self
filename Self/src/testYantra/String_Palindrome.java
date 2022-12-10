package testYantra;

public class String_Palindrome {

	public static void main(String[] args) {
		
		String st = "malayalam"; //level, madam, 
		String s = "";
		
		for(int i=0;i<st.length();i++)
		{
			s=st.charAt(i)+s;	//m am lam alam yalam ayalam layalam alayalam malayalam		
		}
		if(st.equals(s))
		{
			System.out.println("String Palindrome");
		}
		else
		{
			System.out.println("String not Palindrome");
		}
	}

}
