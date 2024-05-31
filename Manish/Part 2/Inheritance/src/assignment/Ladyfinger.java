package assignment;

public class Ladyfinger extends Vegetable {
	int marketPrice = 40;
	public static void main(String[] args) {
		Vegetable v = new Vegetable();
		Ladyfinger l = new Ladyfinger();
		l = (Ladyfinger) v; //give class cast exception
		System.out.println(l.marketPrice);
	}
}
