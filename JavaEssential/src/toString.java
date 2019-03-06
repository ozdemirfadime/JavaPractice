package deneme;
 class Dog
{   private int id;
	 private String name ;
	 public Dog(int id ,String name)
	 {
		 this.id =id;
		 this.name =name;
	 }
	public String toString() {
	//return id + ":"+name;
		/*StringBuilder sb = new StringBuilder();
		sb.append(id).append(":").append(name);
		return sb.toString();*/
		return String.format("%-4d: %s",id,name); //%4d :4br then write
		
	
}
	
}

public class toString {

	public static void main(String[] args) {
		Object obj = new Object();
		Dog dog1 = new Dog(0,"bobi");
		Dog dog2= new Dog(1,"naci");

		System.out.println(dog1);
		System.out.println(dog2);

	}

}
