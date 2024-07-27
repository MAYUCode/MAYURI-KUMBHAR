
public class __stringbuffer__ {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		StringBuffer buffer = new StringBuffer("Hello");
		System.out.println("Buffer = "+buffer);
		System.out.println("Bufferlength= " + buffer.length());
		System.out.println(buffer.capacity());
	
		
		int a=42;
		
		buffer=new StringBuffer(40);
		String s= buffer.append("a=").append(a).append("!").toString();
		
		System.out.println(s);
		
		buffer.delete(3, 6);
		System.out.println(buffer);
		
		
		
		
		
		
	}

}
