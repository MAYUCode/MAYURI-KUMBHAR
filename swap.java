
public class swap {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int a= 5;
		int b= 6;
		int temp;
		
		System.out.println("a="+a);
		System.out.println("b="+b);
		
		//third variable
		temp=a;
		a=b;
		b=temp;
		
		System.out.println("\nafter swap of no. \na="+a);
		System.out.println("b="+b);
		
		//two variables used
		
		a=a+b;
		b=a-b;
		a=a-b;
				
		System.out.println("\nafter swap of no. \na="+a);
		System.out.println("b="+b);
		
		//using multiply and divide 
		
		a=a*b;
		b=a/b;
		a=a/b;
				
		System.out.println("\nafter swap of no. \na="+a);
		System.out.println("b="+b);
		
		

		
	}

}
