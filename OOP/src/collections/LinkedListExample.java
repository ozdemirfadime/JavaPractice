package collections;
import java.util.LinkedList;
import java.util.List;
public class LinkedListExample {

	public static void main(String[] args) {
//create non generic linked list 
List linkedList1 = new LinkedList();
  linkedList1.add("string1");
  linkedList1.add(2);
  linkedList1.add(false);
  System.out.println(linkedList1);
  linkedList1.remove(1); // index:1
  System.out.println(linkedList1);
  linkedList1.removeAll(linkedList1);
  System.out.println(linkedList1);

  //create generic linked list
  List<String> linkedList2 = new LinkedList<String>();
  linkedList2.add("string1");
  linkedList2.add("string2");
  linkedList2.add("string3");
  System.out.println(linkedList2);
  linkedList2.remove(1); // index:1
  System.out.println(linkedList2);
 // linkedList1.removeAll(linkedList2);
  //System.out.println(linkedList2);
  //create generic linked list
 LinkedList<String> linkedList3 = new LinkedList<String>();
  linkedList3.add("string1");
  linkedList3.add("string2");
  linkedList3.add("string3");
  System.out.println(linkedList3);
  linkedList3.remove(1); // index:1
  System.out.println(linkedList3);
  
  
	}

}
