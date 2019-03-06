package collections;

import java.util.ArrayList;
import java.util.List;

public class ArrayListExample {

	public static void main(String[] args) {
		//non generic arraylist
		List arrayList = new ArrayList();
		arrayList.add("string1");
		arrayList.add(2);
		arrayList.add(false);
		System.out.println(arrayList);
		arrayList.remove(2); //remove false
		System.out.println(arrayList);
 
		//non generic arraylist
		List arrayList1 = new ArrayList();
		arrayList1.add("string2");
		arrayList1.add(3);
		arrayList1.add(true);
		System.out.println(arrayList1);
		arrayList1.remove(2); //remove true
		System.out.println(arrayList1);
//generic arraylist
		List<String> arrayList2 = new ArrayList<String>();
		arrayList2.add("string1");
		arrayList2.add("string2");
		arrayList2.add("string3");
		System.out.println(arrayList2);
		arrayList2.remove(2); //remove false
		System.out.println(arrayList2);
		
		//generic arraylist
		ArrayList<String> arrayList3 = new ArrayList<String>();
		arrayList3.add("string1");
		arrayList3.add("string2");
		arrayList3.add("string3");
		System.out.println(arrayList3);
		arrayList3.remove(2); //remove false
		System.out.println(arrayList3);
		
		
		//generic arraylist
		ArrayList<Double> arrayList4 = new ArrayList<Double>();
		arrayList4.add(2.45);
		arrayList4.add(4.486);
		arrayList4.add(3.456);
		System.out.println(arrayList4);
		arrayList4.remove(2); //remove false
		System.out.println(arrayList4);
	}

}
