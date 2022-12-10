package SpecPattern;

public class sp3 {

	public static void main(String[] args) {
		String st="ABC123DCA";
		String a[]=st.split(" ");//A[]={"ABC123DCA"}
		String b[]=st.split("");//{A,B,C,1,2,3,D,C,A}
		
		
		System.out.println(a.length);
		System.out.println(b.length);
		for(int i=0;i<a.length;i++)
		{
			System.out.println(a[i]);//ABC123DCA		
		}
		System.out.println();
		for(int i=0;i<b.length;i++)
		{
			System.out.println(b[i]);//ACD321CBA
		}
	}

}
