package boxing;

public class Boxing {
	public static void main(String[] args) {
		//Byte
		byte b = 2;
		Byte b1 = new Byte(b);
		System.out.println(b1);
				
		//Short
		short s = 24;
		Short s1 = new Short(s);
		System.out.println(s1);
		
		//integer
		int i = 10;
		Integer n = new Integer(i);
		System.out.println(n);
				
		//Long
		long l = 279927923l;
		Long l1 = new Long(l);
		System.out.println(l1);
				
		//Float
		float f = 45.4f;
		Float f1 = new Float(f);
		System.out.println(f1); 
				
		//double
		double d = 453.5;
		Double d1 = new Double(d);
		System.out.println(d1);
				
		//character
		char c = 'A';
		Character c1 = new Character(c);
		System.out.println(c1);
	}
}
