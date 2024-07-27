
public class data_type {

	int a=2;
	float b=3.6f;
	String c= "mayuri kumbhar";
	double d=33.389;
	
	
	char char_c='a';
	long l=9;
	short s=2333;
//	boolean b = True;
	
	int g = Integer.MAX_VALUE;
	
	int h = Integer.MIN_VALUE;
	
	byte Btyye = Byte.MAX_VALUE;
	byte Btyy = Byte.MIN_VALUE;

	
	
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		data_type obj = new data_type();
		
		System.out.println("int= "+obj.a+"float= "+obj.b+"String= "+obj.c);
		
		System.out.println("doblle="+obj.d);
		
		System.out.println("long"+obj.l);
		
		System.out.println("Char = "+ obj.char_c);

		System.out.println("short  = "+ obj.s);

		System.out.println("Char_c = "+ obj.char_c);
		
		System.out.println("maximum innteger value an mmin is ="+obj.g+"MIN ="+obj.h);

		System.out.println("maximum byte value = "+ obj.Btyye);
		
		System.out.println("minimum byte value  = "+ obj.Btyy);

		short myValue = 32761;
		short newValue = (short) (myValue/2);
        System.out.println(newValue);


		
	}

}
