package testYantra;

public class String_Count_How_Many_Words {

	public static void main(String[] args) {
		String st="Hi Good morning";
		String[] s = st.split(" ");
		
		System.out.println(s.length);//3
		System.out.println(st);//Hi Good morning
		
		for(int i=0;i<s.length;i++)
		{
			System.out.println(s[i]);
		}

	}

}
