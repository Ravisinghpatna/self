
public class StringSent {

	public static void main(String[] args) {
		
		String str="my name is ravi singh";
		String[] s = str.split(" ");

		String temp=s[0];
		s[0]=s[3];
		String temp2 = s[1];
		s[1]=s[4];
		s[3]=temp;
		s[4]=temp2;
		
		
		for(int i=0;i<s.length;i++)
		{
			System.out.println(s[i]);
		}
		
		
		
		
		
	}

}
