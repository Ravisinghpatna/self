package StringPractice;

public class String_sentence_rev {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "ma'am shruthi loves i";
		String [] s=str.split(" ");
		
		
		for(int i=s.length-1;i>=0;i--)
		{
			System.out.print(s[i]+" ");
		}
		
	}

}
