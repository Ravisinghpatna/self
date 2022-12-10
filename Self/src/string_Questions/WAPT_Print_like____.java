package string_Questions;

public class WAPT_Print_like____ {

	public static void main(String[] args) {
		String	str="Hi Good Morning";
		String[] ar = str.split(" ");
		String rev = "";

		for(int i=0;i<ar.length;i++)
		{
			rev=ar[i]+" "+rev;//Hi---  Good Hi-----  Morning Good Hi
		}

		System.out.println(rev);   //Morning Good Hi 
		
		char[] arr2 = rev.toCharArray();
		String rev2 = "";

		for(int i=0; i<arr2.length; i++)
		{
			rev2=arr2[i]+rev2;
		}
		System.out.println(rev2.trim());

	}

}
