
public class __String__ {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		char c[] = {'I','n','d','i','a'};
		
		String s= new String(c);
		
		System.out.println(c);
		
		
		String s1 = "TNSIF";
		String s2 = "TNSIF";
		
		String s3 = new String("TNSIF");
		
		String s4 = new String("TNSIF");
		
		System.out.println("case1: " + (s1==s2));
		
		System.out.println("case2: " + (s1.equals(s2)));
		
		System.out.println("case3: " + (s3==s4));
		
        System.out.println("case4: " + (s2.equals(s4)));
        
		System.out.println("case5: " + (s1==s3));

        System.out.println("case6: " + (s3.equals(s4)));
        
        System.out.println(s1.hashCode());
        
        System.out.println(s2.hashCode());
        
        System.out.println(s3.hashCode());
        
        System.out.println(s4.hashCode());
        
        System.out.println(s1.compareTo("AA")); // UNICODE VALUE 
        
        System.out.println(s1.compareTo(s4));
        
        System.out.println(s1.compareToIgnoreCase("tnsf"));
        
        
        System.out.println("###################################################");
        
        // operation on string 
        
        String str = " i n dian ";
        
        String str2 = str.toUpperCase();
        
        String str3 = str.substring(1,3);
        
        System.out.println(str.length());
        System.out.println(str2.length());
        
        
        System.out.println(str);
        System.out.println(str2);
        System.out.println(str3);       

        
        System.out.println(str.strip());
        
        System.out.println(str.trim());
        
        System.out.println(str.stripTrailing());
        
        System.out.println(str.isEmpty());





		


		

	}

}
