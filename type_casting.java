
public class type_casting {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int a=22;
		int b=33;
		
		long c= a*b;
		
		System.out.println("c="+c);

		short d =(short) c ;
		
		System.out.println("c="+c);
		
		d = Short.MAX_VALUE;
		short e = Short.MIN_VALUE;

		System.out.println("d="+d+"\t"+e);
	}

}
