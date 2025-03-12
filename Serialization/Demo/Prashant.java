package Demo;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class Prashant {
	
	public static void main(String[] args) throws Exception {
		
		FileInputStream a = new FileInputStream("D:\\abc.ser");

		ObjectInputStream b = new ObjectInputStream(a);
		
		Car obj =(Car) b.readObject();
		
		System.out.println(obj.name);
		System.out.println(obj.color);
		System.out.println(obj.price);
	}
}







