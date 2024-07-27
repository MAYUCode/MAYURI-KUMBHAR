import java.util.Arrays;

public class oddelarray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int arr[]= {22,33,44,55,66,77,88,99};
		
		int count =0;
		for (int i=0;i<arr.length;i++)
		{
			if(arr[i]%2==0)
			{
				System.out.println("even"+arr[i]);
			
			}
		}
				
		for (int i=0;i<arr.length;i++)
		{
		if(arr[i]%2!=0)
		{
			System.out.println("odd"+arr[i]);
		}
		}
		
		int arrc[]= {2,2,2,2,2,2,2};
		
		
		System.out.println(Arrays.toString(arrc));
		
		
	}

}
