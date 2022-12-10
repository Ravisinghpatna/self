package SpecPattern;

import java.util.TreeSet;

public class NumberOfOccurrence_Sp4 {

	public static void main(String[] args) {
		String  st="ABC123DCDA";
		
		
		for(int i=0;i<st.length();i++)
		{
			char ch = st.charAt(i);
			int count=0;
			
			for(int j=0;j<st.length();j++)
			{
				if(ch==st.charAt(j))
				{
					count++;
				}
			}

			
			System.out.println(ch+"  : "+count);
		}
	}
}
