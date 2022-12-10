
public class Reverse_String {

	public static void main(String[] args) {
		String str = "Patna is place my";
		String[] s1 = str.split(" ");
		String s2 = "";
		
		for(int i=0;i<s1.length;i++)
		{
			s2=s1[i]+" "+s2;
			s2=s2+s1[i]+" ";
		}
		System.out.println(s2);
	}

}
