package testYantra;

public class Arr_B {
	public static void main(String []ravi)
	{int ar[]= {43,56,89,25,98};
	
	int big=ar[0];
	
	for(int i=0;i<ar.length;i++)
	{
		if(ar[i]>big)
		{
			big=ar[i];
		}
	}
	System.out.println(big);

	}
}
