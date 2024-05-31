package parcing;

public class Parcing {
	public static void main(String[] args) {
		String s = "123";
		
		Integer i = Integer.parseInt(s);
		System.out.println(i);
		
		Byte b = Byte.parseByte(s);
		System.out.println(b);
		
		Short s1 = Short.parseShort(s);
		System.out.println(s1);
		
		Long l = Long.parseLong(s);
		System.out.println(l);
		
		Boolean b1 = Boolean.parseBoolean(s);
		System.out.println(b1);
		
		Float f = Float.parseFloat(s);
		System.out.println(f);
		
		Double d = Double.parseDouble(s);
		System.out.println(d);
	}
}
