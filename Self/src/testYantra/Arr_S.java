package testYantra;

public class Arr_S {
public static void main(String []Ravi)
{
	int arr[]= {54,60,70,80,20,100};
	
	int small=arr[0];
	for(int i=0;i<arr.length;i++)
	{
		if(arr[i]<small)
		{
			small=arr[i];
		}
	}
	System.out.println(small);
}
}
