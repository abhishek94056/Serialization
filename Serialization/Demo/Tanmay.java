package Demo;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class Tanmay {
	
	public static void main(String[] args) throws Exception {
		
		Car c = new Car();
		c.name = "Swift";
		c.color = "Red";
		c.price = "9 lacs";
		
		FileOutputStream a = new FileOutputStream("D:\\abc.ser");

		ObjectOutputStream b = new ObjectOutputStream(a);
		
		b.writeObject(c);
		
		System.out.println("Object serialized...");
	}
}







