package testYantra;

public class ArrayInRange {

	public static void main(String[] args) {
		//int arr[]= {11,22,33,4,55,66,7,8,88,99};
		int arr[]=new int[4];
		arr[0]=10;
		arr[1]=20;
		arr[2]=30;
		arr[3]=40; 
		
		int big=arr[0];
		
		for(int i=0;i<arr.length;i++)
		{
			if(arr[i]>big)
			{
				big=arr[i];
			}
		}
		System.out.println(big);

	}

}
