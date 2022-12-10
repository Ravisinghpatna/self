package SpecPattern;

public class Sp2 {

	public static void main(String[] args) {
		String st="ABC123DCA";
		String a[]=st.split(" ");//A[]={"ABC123DCA"}
		String b[]=st.split("");//{A,B,C,1,2,3,D,C,A}
		
		
		System.out.println(a.length);
		System.out.println(b.length);
		
		for(int i=a.length-1;i>=0;i--)
		{
			System.out.println(a[i]);//ABC123DCA		
		}
		System.out.println();
		for(int i=b.length-1;i>=0;i--)
		{
			System.out.println(b[i]);//ACD321CBA
		}
	}

}
