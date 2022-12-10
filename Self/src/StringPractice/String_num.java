package StringPractice;

import java.util.Arrays;

public class String_num {
	public static void main(String[] args) {
		
		int []a= {10,2,3,5,1,9};
		Arrays.sort(a);//{1,2,3,5,9,10}
		
		
		System.out.println("Descending order ");
		for(int i=a.length-1;i>=0;i--)//{10,9,5,3,2,1}
		{
			System.out.print(+a[i]+" ");//descending order
		}
		
		System.out.println();
		
		System.out.println("Ascending order ");
		for(int i=0;i<a.length;i++)//{1,2,3,5,9,10}
		{
			System.out.print(+a[i]+" ");//descending order
		}
		
		
	}

}
