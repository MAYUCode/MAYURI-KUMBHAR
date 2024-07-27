import java.util.Arrays;

public class array {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		int arr[]= {69,43,55,55,67};
		
		System.out.println(Arrays.toString(arr));
		
		for(int i=0;i<5;i++)
		{
			System.out.println(arr[i]);
		}
		
		//sort
		Arrays.sort(arr);
		System.out.println(Arrays.toString(arr));
		
		
		//binary search
		
		System.out.println(Arrays.binarySearch(arr,69));
		
		System.out.println(Arrays.binarySearch(arr,0,4,69));
		
		int arr1[]= {21,20,60,40,50};
		
		if(Arrays.compare(arr, arr1)==0)
		{
			System.out.println("both same");
		}
		else
		{
			System.out.println("not same");
		}
		
		int arr2[]=Arrays.copyOf(arr1, 2);
		
		System.out.println(Arrays.toString(arr2));
		
		
		
		// Mutli dimenesional array 
		
		   int multiarr[][]= {{2,3,4},{5,6,7},{8,9,0}};
		   
		   for(int i=0;i<3;i++)
		   {
			   for(int j=0;j<3;j++)
			   {
				   
			   }
		   }
		   
		   
		   
		
	}

}

