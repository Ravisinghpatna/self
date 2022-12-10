package SpecPattern;

import java.util.ArrayList;

public class NumberAndAlphabet {

	public static void main(String[] args) {
		String st="ABC123DCA";
		ArrayList num=new ArrayList();
		ArrayList alpha=new ArrayList();
		for(int i=0;i<st.length();i++)
		{
			char x = st.charAt(i);
			System.out.print(x+" ");
			if(x>='1' && x<='9')
			{
				num.add(x);
			}
			if(x>='A'&& x<='Z')
			{
				alpha.add(x);
			}
		}
		System.out.println();
		System.out.println("Numbers :"+num);
		System.out.println("Alphabet :"+alpha);


	}

}
