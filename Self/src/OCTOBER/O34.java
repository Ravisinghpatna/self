package OCTOBER;

public class O34 {
	public static void main(String[] args) {
		int n=5;
		int sp=n/2,st=1;
		for(int i=1;i<=n;i++)
		{
			for(int j=1;j<=sp;j++)
			{
				System.out.print(" ");
			}
			for(int j=1;j<=st;j++)
			{
				System.out.print("*");
			}
			if(i<=n/2)
			{
				sp--;
				st=st+2;}
			else
			{
				sp++;  //3
				st=st-2;  //-1
			}

			System.out.println();
		}
	
		for(int i=n;i>=0;i--)
		{
			for(int j=1;j<=sp;j++)
			{
				System.out.print(" ");
			}
			for(int j=1;j<=st;j++)
			{
				System.out.print("*");
			}
			if(i<=n/2)
			{
				sp++;
				st=st-2;}
			else
			{
				sp--;  //3
				st=st+2;  //-1
			}

			System.out.println();
		}
	}


}


