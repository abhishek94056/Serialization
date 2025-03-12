package Task3;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
public class Seri {
	public static void main(String[] args) throws Exception{
		Bird b = new Bird();
		b.name="Parrots";
		b.b_id=78;
		b.age=2;
		b.food="guava";
		Animal a = new Animal();
		a.name="Cow";
		a.a_id=98;
		a.age=13;
		a.food="Grass";
		Tree t = new Tree();
		t.name="Banayan";
		t.t_id=97;
		t.age=235;
		
		FileOutputStream F = new FileOutputStream("D:\\abc.ser");

		ObjectOutputStream O = new ObjectOutputStream(F);
		
		O.writeObject(b);
		O.writeObject(a);
		O.writeObject(t);
		
		System.out.println("Object serialized...");
	}		
	}


