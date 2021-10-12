import java.util.LinkedList;
import java.util.ListIterator;


public class Test2 {

	public static void main(String[] args) {
		
			LinkedList ll = new LinkedList();
			ll.add("Java");
			ll.add("Angular");
			ll.add("ReactJS");
			ll.add("JavaScript");
			ll.add("Python");
			
			System.out.println(ll);
			System.out.println("-----------------------");
			
			System.out.println("Using for each loop");
			for (Object object : ll) {
				System.out.println(object);
			}
			
			System.out.println("---------------------");
			ListIterator litr = ll.listIterator();
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
