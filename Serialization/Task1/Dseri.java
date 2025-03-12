package Task1;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

import Demo.Car;
public class Dseri {
	public static void main(String[] args) throws IOException, ClassNotFoundException {
		FileInputStream f2 = new FileInputStream("D:\\abhi.ser");
		ObjectInputStream o2 = new ObjectInputStream(f2);
		
		Student obj =(Student) o2.readObject();
		System.out.println(obj.id);
		System.out.println(obj.name);
		System.out.println(obj.age);
		
	}

}
