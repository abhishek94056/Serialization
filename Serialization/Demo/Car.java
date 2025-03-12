package Demo;
import java.io.Serializable;

public class Car implements Serializable {
	
	public String color;
	public String name;
	public transient String price;
}