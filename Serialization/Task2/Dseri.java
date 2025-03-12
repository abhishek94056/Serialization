package Task2;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
public class Dseri {
	public static void main(String[] args) throws Exception {
		FileInputStream f = new FileInputStream("D:\\Task2");
		ObjectInputStream O = new ObjectInputStream(f);
		
		Animal ani =(Animal)O.readObject();
		System.out.println(ani.name);
		System.out.println(ani.a_id);
		System.out.println(ani.age);
		System.out.println(ani.food);
	
	}

}
