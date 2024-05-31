package exception;

import java.util.InputMismatchException;
import java.util.Scanner;

public class P5 {
	static void takeInput() throws InputMismatchException {
		byte b = sc.nextByte();
		System.out.println(b);
	}
	static Scanner sc = new Scanner(System.in);
	public static void main(String[] args) {
		try {
			takeInput();
		}
		catch (InputMismatchException i) {
			System.out.println("Enter the Byte type data");
		}
		sc.close();
	}
}
