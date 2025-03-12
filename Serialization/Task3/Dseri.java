package Task3;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

import Demo.Car;
public class Dseri {
	public static void main(String[] args) throws Exception{
		FileInputStream F1 = new FileInputStream("D:\\abc.ser");
		ObjectInputStream O2 = new ObjectInputStream(F1);
		Bird obj =(Bird) O2.readObject();
		Animal obj1 =(Animal) O2.readObject();
		Tree obj2 =(Tree) O2.readObject();
		System.out.println(obj.name);
		System.out.println(obj.b_id);
		System.out.println(obj.age);
		System.out.println(obj.food);
		System.out.println(obj1.name);
		System.out.println(obj1.a_id);
		System.out.println(obj1.age);
		System.out.println(obj1.food);
		System.out.println(obj2.name);
		System.out.println(obj2.t_id);
		System.out.println(obj2.age);		
	}
}
