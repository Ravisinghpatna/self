package testYantra;

public class ReverseWords {

	public static void main(String[] args) {
		
		String st="This is my class";
		char[] ch=st.toCharArray();
		String s="";
		
		for(int i=0;i<ch.length;i++)
		{
			int k=i;
			while(i<ch.length && ch[i]!=' ')
			{
				i++;
			}
			
			int j=i-1;
			
			while(k<=j)
			{
				s=s+ch[j];
				j--;
			}
			
			if(i<ch.length)
				s=s+ch[i];
						
		}
		System.out.println(st);
		System.out.println(s);
	}

}
