package collections;

import java.util.Vector;

public class VectorList {

	public static void main(String[] args) {
	//create vector1
		Vector vector1 = new Vector();
		vector1.add(20);
		vector1.add("String");
		vector1.add(false);
		System.out.println(vector1);
		vector1.remove(0);
		System.out.println(vector1);
		System.out.println(vector1.size());
		 
		//create vector2
				Vector vector2 = new Vector(2);
				vector2.add(20);
				vector2.add("String");
				vector2.add(true);
				System.out.println(vector2);
				vector2.remove(0);
				System.out.println(vector2);
				vector1.add( "adf");//canot add or remove
				System.out.println(vector1.size());
				System.out.println(vector2);
		
		

	}

}
