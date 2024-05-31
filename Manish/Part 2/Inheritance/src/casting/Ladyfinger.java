package casting;

public class Ladyfinger extends Vegetable {
	int marketPrice = 40;
	@Override
	void print() {
		System.out.println("Hi from child");
	}
	
	public static void main(String[] args) {
		//Vegetable v = new Ladyfinger();
		//System.out.println(v.price);
		
		//Ladyfinger l = (Ladyfinger) new Vegetable();
		/*Vegetable v = new Vegetable();
		Ladyfinger l = new Ladyfinger();
		l = (Ladyfinger) v;		//throw class cast exception
		System.out.println(l.marketPrice);*/
		
		Vegetable v = new Ladyfinger();
		
		System.out.println(v.price);
		
		v.print();
		
		
	}
}
