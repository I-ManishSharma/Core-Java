package assignment;

public class Apple extends Fruit{
	
	int aprice = 100;
	
	public static void main(String[] args) {
		Fruit f = new Apple();
		System.out.println(f instanceof Apple);
		
		if (f instanceof Apple) {
			Apple a = (Apple)f;
			System.out.println(a.aprice);
			System.out.println(a.price);
		}
		
		Fruit f1 = new Fruit();
		System.out.println(f1 instanceof Apple);
	}

}
