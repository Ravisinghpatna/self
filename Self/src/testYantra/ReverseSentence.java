package testYantra;

public class ReverseSentence {

	public static void main(String[] args) {
		
		String str="You are ravi ";
		String[] st=str.split(" ");
		 
		String temp=st[0];
		st[0]=st[2];
		st[2]=temp;
		
		
		for(int i=0;i<st.length;i++)
		{
			System.out.print(st[i]+" ");
		}
		
		
	}

}
