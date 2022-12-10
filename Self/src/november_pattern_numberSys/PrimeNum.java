package november_pattern_numberSys;

public class PrimeNum {

	public static void main(String[] args) {
	int num=10;	
	int x=5,count=0;
	while(num>0)
	{
		
		if(x%2==0)
		{
			count++;
		}
	}
	if(count==2)
	{
		System.out.print("Prime Num");
	}
	else
		System.out.print("Not Prime");
	
	

}}
