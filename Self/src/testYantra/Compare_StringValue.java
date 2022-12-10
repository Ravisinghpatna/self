package testYantra;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.TreeSet;

public class Compare_StringValue {

	public static void main(String[] args) {
		
		TreeSet<String> ts=new TreeSet<String>();
		
		ts.add("seekest");  //[seekest][seeker][seeked][seeking]
		ts.add("seeking");
		ts.add("seeked");
		ts.add("seeker");
		
		ArrayList<String> a=new ArrayList<>(ts);

		String first=a.get(0);	        // seekest
		String last=a.get(a.size()-1);	//seeker
		
		int firstLength=first.length();	//7
		
		if(last.length()<firstLength)
			firstLength=last.length();
		
		for(int i=0; i<firstLength; i++)
		{
			if(first.charAt(i)!=last.charAt(i))
				break;
			else
				System.out.print(first.charAt(i));
		}

	}

}
