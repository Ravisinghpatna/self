package testYantra;

public class RevSTR {

	public static void main(String[] args) {
		
		String str="You are ravi";    //ravi are You
		
		String s="";
		
		for(int i=0;i<str.length();i++)
		{
			s=str.charAt(i)+s;
		}
		
		System.out.println(s);
	}

}
