package StringPractice;

public class Ravi_Name {

	public static void main(String[] args) {
		String s = "RAVI";
		String[] s1 = s.split("");
		int n = s1.length;
		
		for(int i=0;i<n;i++)
		{
			
			for(int j=0;j<=i;j++)
			{
				System.out.print(s1[i]);
			}
			System.out.println();
		}
	}

}
