package StringPractice;

public class String_F_to_L {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str="Ravi name is My";
		String[] s = str.split(" ");
		
		///System.out.println(s.length);

//
//		String first = s[0];
//		String last = s[s.length-1];
//
//		String temp = first;  //Ravi
//		first=last; //My
//		last=temp;//Ravi
//		
//		s[0]=first;
//		s[s.length-1]=last;
		
		
		String temp = s[0];
		s[0]= s[s.length-1];
		s[s.length-1]=temp;
		
		for(int i=0;i<=s.length-1;i++)
		{
			System.out.print(s[i]+" ");
		}


	}

}
