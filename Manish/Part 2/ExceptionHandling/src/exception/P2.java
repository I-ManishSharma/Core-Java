package exception;

public class P2 {
	static void index(int [] arr) throws ArrayIndexOutOfBoundsException {
		System.out.println(arr[6]);
	}
	public static void main(String[] args) {
		int [] arr = new int[6];
		try {
			index(arr);
		} 
		catch (ArrayIndexOutOfBoundsException a) {
			System.out.println("Enter the index less then: "+ arr.length);
		}
	}
}
