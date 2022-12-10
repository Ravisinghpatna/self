package string_Questions;

public class PrintEveryCharacterIn_String_Reverse_Order {

	public static void main(String[] args) {
		
		String str = "Hi Good Morning";
		//String []s=str.split(" ");
		char[] s = str.toCharArray();
		String store = "";
			
		for(int i=0;i<s.length;i++)
		{
			store=s[i]+store;//gninroM dooG iH
		}
		System.out.println(store);
		
		
		
		
	}

}
