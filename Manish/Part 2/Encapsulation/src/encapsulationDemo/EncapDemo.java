package encapsulationDemo;

public class EncapDemo {

	public static void main(String[] args) {
		Person p = new Person();
		p.setName("Arvikk");
		p.setAge(23);
		System.out.println(p.getName());
		System.out.println(p.getAge());
	}
}
