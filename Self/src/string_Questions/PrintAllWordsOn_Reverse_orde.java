package string_Questions;

public class PrintAllWordsOn_Reverse_orde {

	public static void main(String[] args) {

		String 	str="Hi Good Morning";
		String []s=str.split(" ");
		String rev="";
		
		for(int i=0;i<s.length;i++)
		{
			rev=s[i]+" "+rev;
		}
		System.out.println(rev);


	}

}
