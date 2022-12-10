package StringPractice;

public class String_Coun_RevOrder {

	public static void main(String[] args) {

		String s = "Hi Good Morning";
			String [] st=s.split(" ");
		//char [] st=s.toCharArray();

		String store="";
		
		String temp=st[0];
		st[0]=st[st.length-1];
		st[s.length()-1]=temp;
		
		for(int i=0;i<st.length;i++)
		{
			System.out.println(st[i]);
		}
		
		
		
		
		

		//	//count of the given String
		//	System.out.println("count = "+st.length);
		//	
		//	for(int i=0;i<st.length;i++)
		//	{
		//		//what are the swords present in the given String
		//		System.out.println(st[i]);
		
		

//				for(int i=st.length-1;i>=0;i--)
//				{
//					store=store+st[i];
//				}
//			System.out.println(store);
		

//		for(int i=0; i<st.length; i++)
//		{
//			ravi=st[i]+ravi;
//		}
//		System.out.println(ravi);
		
		
		
		
		
		
	}


}


