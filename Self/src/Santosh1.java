
public class Santosh1 {

	public static void main(String[] args) {
		
		double ar[]= {1.5,22.4f,7,'a'};
	//	Pen p[]= {new Pen("red"),new Pen("black")};
		
		Object ob[]= {"Ravi",56,56.78,27.3f,'a'};
		
		for(int i =0;i<ar.length;i++)
		{
			System.out.println(ar[i]);
		}
		System.out.println("-----------------------------------");
		for(Object n:ob)
		{
			System.out.println(n);
		}

	}

}
