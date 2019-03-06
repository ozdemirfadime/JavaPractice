
public class LocalVariable {

 public void getDogAge(int age) {
	 int dogAge = age +12;//local variable
	 System.out.println("dog age is "+dogAge);
 }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
LocalVariable l1 =  new LocalVariable();
l1.getDogAge(12);

	}

}
