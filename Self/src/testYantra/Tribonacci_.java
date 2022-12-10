package testYantra;

public class Tribonacci_ {
public static void main(String[] args) {
	 int n=5, w=0,x=1,y=2,z;
	 
	 for(int i=0;i<=n;i++)
	 {
		 System.out.print(w+" ");
		 z=w+x+y;
		 w=x;
		 x=y;
		 y=z;
		 
	 }
}
}
