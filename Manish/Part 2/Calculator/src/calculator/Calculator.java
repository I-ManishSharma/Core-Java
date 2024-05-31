package calculator;

import a.A;
import b.B;
import c.C;
import d.D;
import e.E;

public class Calculator extends E implements A,B,C,D {
	private int res;
	public int getres() {
		return res;
	}
	
	public void add(int a, int b) {
		res = a + b;
	}
	public void add(int a, int b, int c) {
		res = a + b + c;
	}
	public void sub(int a, int b) {
		res = a - b;
	}
	public void mul(int a, int b) {
		res = a * b;
	}
	public void div(int a, int b) {
		res = a / b;
	}
	public void square(int n) {
		res = n*n;
	}
	public void cube(int n) {
		res = n*n*n;
	}
	public void power(int base, int pwr) {
		res = (int) Math.pow(base, pwr);
	}
}
