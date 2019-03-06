
public class ConsructorMethod101 {
	
	//construct method
	public ConsructorMethod101()
	{
		System.out.println("this is constructo method");
	}
	//constructor with method
	public ConsructorMethod101(String param)
	{
		System.out.println("this is constructor method"
				+ param);
	}
	//instance method
	public void InstanceMethod() {
		System.out.println("this is instance method");
	}
}
class ConstructorMethodExample{
	public static void main(String[] args) {
		//crate object method
		ConsructorMethod101 method1 = new ConsructorMethod101();
		method1.InstanceMethod();
		Customer customer1 = new Customer();
		customer1.getName("jonh");
	}
	 }

