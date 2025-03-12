package Task2;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
public class Seri {
	public static void main(String[] args) throws Exception{
		Animal a = new Animal();
		a.name="Dog";
		a.a_id=67;
		a.age=14;
		a.food="Pedigree";
		FileOutputStream f = new FileOutputStream("D:\\Task2");
		ObjectOutputStream O = new ObjectOutputStream(f);
		
		O.writeObject(a);
		
		System.out.println("Object serialized...");
	}
	

}
