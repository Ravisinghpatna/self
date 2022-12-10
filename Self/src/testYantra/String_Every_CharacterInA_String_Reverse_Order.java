package testYantra;

public class String_Every_CharacterInA_String_Reverse_Order {

	public static void main(String[] args) {

		String st="hi good morning";
		char[] s=st.toCharArray();
		String ss="";
		
		for(int i=0;i<s.length;i++)
		{
			ss=s[i]+ss;
		}
		System.out.println(ss);
	}

}
