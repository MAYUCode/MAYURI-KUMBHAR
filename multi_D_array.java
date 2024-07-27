
public class multi_D_array {

	
		   static void printArray(int c[][])
		   {
			   for( int i =0;i<c.length;i++)
				{ for (int j=0;j<c.length;j++)
				{
					System.out.print(c[i][j]);
				}
					System.out.println();
				}
			   

		   }
		   
		   
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int c[][]= {{1,2,3},{4,5,6},{7,8,9}};
		
		System.out.println("No. of rows of array : " +c.length);
		System.out.println("No. of col of array : " +c.length);

		
		multi_D_array.printArray(c);
	}
	
	

}
