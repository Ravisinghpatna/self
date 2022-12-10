
public class Count {

	public static void main(String[] args) {
		int n=12346745;
		int ravi= 0;
		
		while (n>0)
		{
			ravi++;
			n=n/10;
		}
		
		System.out.println(ravi);
	}

}
