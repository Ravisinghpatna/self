package array;

public class Array_Programs {

	public static void main(String[] args) {

		int a[]=new int[5];
		//int ar[]= {10,20,30,40,50};

		a[0]=10;
		a[1]=20;
		a[2]=70;
		a[3]=40;
		a[4]=50;	

		int big=a[0];
		for(int i=0;i<a.length;i++)
		{

			if(a[i]>big)
			{
				big=a[i];
			}
		}
		System.out.println(big);


	}

}


