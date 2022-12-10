package StringPractice;

public class String_SwapF__L {
	public static void main(String[] args) {
		String st = "india love my i";
		String s[]=st.split(" ");
		//System.out.println(s.length);		
		
		String temp = s[0];    //temp=india
		s[0]=s[s.length-1];    //s[0]=i
		s[s.length-1]=temp;    //s[s.length-1]=india
		
		for(int i=0;i<s.length;i++)
		{
			System.out.print(s[i]+" ");
		}
		
	}

}
