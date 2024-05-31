class Car extends Vehicle {

	int cprice = 1000000;

	public static void main(String [] args) {
		Vehicle v = new Car();
		Car c = (Car) v;
		System.out.println(v.price);
		System.out.println(c.cprice);
	}
}