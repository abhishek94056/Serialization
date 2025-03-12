package Task1;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
public class Seri {
	public static void main(String[] args) throws IOException {
		Student s = new Student();
		s.id=76;
		s.name="Abhi";
		s.age=21;
		
		FileOutputStream f = new FileOutputStream("D:\\abhi.ser");
		ObjectOutputStream o = new ObjectOutputStream(f);
		o.writeObject(s);
		System.out.println("Object Initialize...");
	}
	
	

}
