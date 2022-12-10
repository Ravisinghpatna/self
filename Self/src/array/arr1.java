package array;

public class arr1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		int arr[]= {23,45,64,76,78,87};
//		System.out.println(arr);//address
//		System.out.println(arr.length);//6
//		System.out.println(arr[0]);//23
//		System.out.println(arr.length-1);//5
//		System.out.println(arr[arr.length-1]);//last Element
//		
		
		
		
		//int ar1[]=new int  [5];
		int ar1[];
		
		ar1=new int[5];
		ar1[0]=12;
		ar1[1]=23;
		ar1[2]=32;
		ar1[3]=45;
		ar1[4]=56;
		
		for(int i=0;i<ar1.length;i++)
		{System.out.print(ar1[i]+" ");
			
		}
		System.out.println();
		
		for(int i=ar1.length-1;i>=0;i--)
		{
			System.out.print(ar1[i]+" ");
		}
		
		
		
		
		
		
		
		
	}

}
