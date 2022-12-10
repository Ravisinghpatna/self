package StringPractice;

public class String_Method {

	public static void main(String[] args) {
		String s1="WELCOME";
		String s2 = "welcome";
		
		
		//length of the String
		System.out.println(s2.length());//7
		
		//concat join the String
		System.out.println(s1.concat(" Java"));
		
		//equals ...equalsIgnoreCase....contains
		System.out.println(s1.equals(s2));//false
		System.out.println(s1.equalsIgnoreCase(s2));//true
		
		System.out.println(s1.contains("wel"));//false
		
		//substring...
		System.out.println(s1.substring(0, 2));//WE
		System.out.println(s1.substring(2, 5));//LCO
		System.out.println(s1.substring(4, 7));//OME
		
		System.out.println(s1.replace('M', 'O'));//WELCOOE
		System.out.println(s1.replace("WEL", "JAVA"));
		
		


	}

}
