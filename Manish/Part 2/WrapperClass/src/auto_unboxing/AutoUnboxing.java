package auto_unboxing;

import java.util.Scanner;

public class AutoUnboxing {
	public static void main(String[] args) {
		//Integer
		Integer i = 23;
		int i1 = i;
		System.out.println(i1);
		
		//Float
		Float f = 37.49f;
		float f1 = f;
		System.out.println(f1);
		
		//Character
		Character c = 'A';
		char c1 = c;
		System.out.println(c1);
		
		
		Scanner sc = new Scanner(System.in);
		String s = sc.next();
		char [] ch = s.toCharArray();
		for (char c2 : ch) {
			System.out.print(c2+" ");
		}		
		sc.close();
		
		
		StringBuilder sb = new StringBuilder();
		sb.append("Manish");
		sb.append("Sharma");
		System.out.println(sb);
		
		StringBuffer st = new StringBuffer();
		st.append("MAnish");
		
		System.out.println(st);
	}
}
