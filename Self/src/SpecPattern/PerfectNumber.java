package SpecPattern;

public class PerfectNumber {

	public static void main(String[] args) {

		for(int r=1;r<=10000; r++)
		{
			int	count=0;
			for(int i=1;i<r;i++)
			{
				if(r%i==0)
				{
					count=count+i;
				}
			}
			if(count==r)
			{
				System.out.println(r);
			}
		}
	}
}
