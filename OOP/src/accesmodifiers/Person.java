package accesmodifiers;

 public class Person {
	 int age =40;
	 //protected method 
	 protected void great(String name)
	 {
		 System.out.println(String.format("hello %s",name));
	 }
	 class People {
		 
		 int age =40;
		 //default method  not public,private,protected
		 void great(String name)
		 {
			 System.out.println(String.format("hello %s",name));
		 }}
	 public class Customer{
		//public method
		 public void great(String name)
		 {
			 System.out.println(String.format("helo l%s ", name));
			 
		 }
	 }

	public static void main(String[] args) {
		Person person1 = new Person();
		System.out.println(person1.age);
		person1.great("cedi");
		//People people1 = new People();
		//people1.greet("kevin");

	}

}
