package Date_2_Dec;

public class StringRever {

	public static void main(String[] args) {

		String st = "karnataka";
		
		int count1 = 0;
		int count2=0, count3=0,count4=0,count5=0;
		
		
		for(int i=0;i<st.length();i++)
		{
			char ch=st.charAt(i);
			if(ch=='k')
			{
				count1++;
			}
			if(ch=='a'||ch=='A' )
			{
				count2++;
			}
			if(ch=='r' )
			{
				count3++;
			}
			if(ch=='n' )
			{
				count4++;
			}
			if(ch=='t' )
			{
				count5++;
			}
			
		}
		System.out.println("k---"+count1);
		System.out.println("a---"+count2);
		System.out.println("r---"+count3);
		System.out.println("n---"+count4);
		System.out.println("t---"+count5);
		
		
		
	}

}
