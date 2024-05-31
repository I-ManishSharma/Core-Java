package exception;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;

public class P9 {
	
	static void file() throws FileNotFoundException {
		FileOutputStream f = new FileOutputStream("C:\\f1\\ftp.txt");
		System.out.println(f);
	}

	public static void main(String[] args) {
		
		System.err.println("MANISH SHARMA");
	
		try {			
			file();
		}
		catch (FileNotFoundException a) {
			System.out.println("Enter the correct file name");
		}
	}

}
