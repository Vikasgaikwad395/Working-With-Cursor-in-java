import java.util.Vector;
import java.util.Enumeration;

public class Test3 {

	public static void main(String[] args) {
			
		Vector v = new Vector();
		v.addElement("Java");
		v.addElement("Angular");
		v.addElement("ReactJS");
		v.addElement("JavaScript");
		v.addElement("Python");
		
		System.out.println(v);
		
		System.out.println("----------------------------");
		System.out.println("Using For each loop");
		for (Object object : v){
			System.out.println(object);
			
		}
		System.out.println("-----------------------------");
		System.out.println("By using Enumeration");	
		Enumeration e = v.elements();
		while (e.hasMoreElements()) {
			System.out.println(e.nextElement());
		}		

	}

}
