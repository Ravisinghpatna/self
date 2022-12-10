package StringPractice;

public class SwippinttheNumbers {

	public static void main(String[] args) {
		int a=10,b=20;
		System.out.println(a+ "  "+b);

		//1 method  by using 3rd variables
//		int n=a;
//		a=b;
//		b=n;
//		System.out.println(a+"  "+b);
		
		
		// 2 method by using + and - operator
//		a=a+b; //10+20=30
//		b=a-b; //30-20=10
//		a=a-b; //30-10=20
//		
//		System.out.println(a+"  "+b);
		
		//3 method using * and / - operators
		
	
//		a=a*b; //10*20=200
//		b=a/b;//200/20=10
//		a=a/b;//200/10=20
//		
//		System.out.println(a+"  "+b);
//		
		
		//4 method by using xor operator
		
//		a=a^b;  
//		b=a^b;
//		a=a^b;
//		System.out.println(a+"  "+b);
		
		//5 method by using single line
		
		b=a+b-(a=b);
		System.out.println(a+"  "+b);

	}

}
