package testYantra;

public class String_Vowel_OR_NOT {

	public static void main(String[] args) {

		String str="Ravi Singh";
		
		if(str.toLowerCase().matches(".*[a,e,i,o,u].*"))
		if(str.toUpperCase().matches(".*[A,E,I,O,U].*"))
		{
			System.out.println("vowel");
		}
		else
			System.out.println("not vowel");
		
		
		
		
		
		
	}




}


