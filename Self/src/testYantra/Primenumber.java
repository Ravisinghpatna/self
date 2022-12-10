package testYantra;

public class Primenumber {

	public static void main(String[] args) {
		//int n=29;
		
		for(int j=1;j<=100;j++)
		{

			int count=0;
			for(int i=2;i<=j/2;i++)
			{
				if(j%i==0)
				{
					count++;	
				}
			}	
			if(count==0)
				System.out.print(j+" ");
		}


	}

}
