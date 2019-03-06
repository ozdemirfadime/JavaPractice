package overriding;

public class OverridingMethod {
	public static void main(String args[]) {
		
		Animal animal1 = new Animal();
		Animal animal2 = new Dog();
		Dog animal3 = new Dog();
		animal1.talk();
		animal2.talk();
		animal3.talk();
	}

}
