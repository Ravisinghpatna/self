package StringPractice;

public class ReversetheString {

	public static void main(String[] args) {
		String st="Qspiders Jspiders or Pyspiders";
		String ar[]=st.split(" ");
		for(int i=ar.length-1;i>=0;i--)
		{
			System.out.println(ar[i]);
		}

	}

}
