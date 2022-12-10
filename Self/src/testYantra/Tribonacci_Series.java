package testYantra;

public class Tribonacci_Series {

	public static void main(String[] args) {
		int n=9;
		int a=0,b=1,c=2,d;
		
		for(int i=1;i<=n;i++)
		{
			System.out.println(a);
			d=a+b+c;
			a=b;
			b=c;
			c=d;
		}

	}

}
