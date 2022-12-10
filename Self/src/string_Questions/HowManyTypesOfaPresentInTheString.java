package string_Questions;

public class HowManyTypesOfaPresentInTheString {
	public static void main(String[] args) {
	String str = "Java Evening";
	int count=0;

	char[] s1 = str.toCharArray();
	
	for(int i=0;i<str.length();i++)
	{
		if(s1[i]=='n')
		{
			count++;
		}
	}
	System.out.println(count+" 'n' present of String "+str);
	
	}

}
