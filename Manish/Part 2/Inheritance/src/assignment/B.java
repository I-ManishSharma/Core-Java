package assignment;

public class B extends A{

	int num2 = 45;
	public static void main(String[] args) {

		A a = new B(); // UpCasting
		System.out.println(a.num); //accessing parent class num
		//System.out.println(a.num2); //give error
		B b = (B)a; //DownCasting
		System.out.println(b.num); //accessing parent class num
		System.out.println(b.num2); //accessing child class num2 
	}

}
