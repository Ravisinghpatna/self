
public class PrintDigitCount {

	public static void main(String[] args) {
	int x=1246789,count=0;
	while(x>0)
	{
		int a=x%10;
		count++;
		x=x/10;
	}
			System.out.println(count);
	}

}
