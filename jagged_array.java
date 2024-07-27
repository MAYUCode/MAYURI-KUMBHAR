
public class jagged_array {

	static void jagged_array(int arr[][])
	{
		for(int i=0;i<arr.length;i++)
		{
			for( int j=0;j<arr[i].length;j++)
			{
				System.out.print(arr[i][j]);
			}
			System.out.println();
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
	int arr[][] = {{1,2},{1,2,3},{2,3,4,5,6,67},{2},{5,7,8}};
	
	System.out.println("No of rows of jagged array is :"+arr.length);
	
	jagged_array.jagged_array(arr);
		

	}

}
