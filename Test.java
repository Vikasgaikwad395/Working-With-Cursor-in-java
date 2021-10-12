import java.util.ArrayList;
import java.util.ListIterator;

public class Test {

	public static void main(String[] args) {
	
		ArrayList al = new ArrayList();
		al.add("Java");
		al.add("Angular");
		al.add("ReactJs");
		al.add("JavaScript");
		al.add("Python");
		
		System.out.println("Print the element Using for each");
		for (Object object : al) {
			System.out.println(object);
		}
		System.out.println("------------------------------------ ");
		ListIterator litr = al.listIterator();
		while (litr.hasNext()) {
			String element = (String)litr.next();
			litr.set(element +"+");
		}
		
		System.out.println("Modified List Backward");
		while (litr.hasPrevious()) {
			System.out.println(litr.previous());
			
		}
	}

}
