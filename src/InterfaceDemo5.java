import java.util.Arrays;

public class InterfaceDemo5 {
public static void main(String[] args) {
	Product [] array = new Product[3];
	array[0] = new Product("Ballpen", 200, "모나미");
	array[1] = new Product("Notebook", 2500000, "apple");
	array[2] = new Product("Keyboard", 20000, "Logitech");
	Arrays.sort(array);	
	System.out.println(Arrays.toString(array));
	}
}
