package deneme;

class Frog{
	 private String name;
	 private int age;
	public  void setName(String name) {
		// TODO Auto-generated method stub
		//name = newName;
		this.name =name;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getName() {
		return name;
	}
	public int Age() {
		return age;
	}
	public void setInfo(String name,int age) {
		setName(name);
		setAge(age);
	}
}
public class Set_this {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
 Frog frog1 = new Frog();
 //frog1.name ="berti";
// frog1.age =5;
 frog1.setAge(15);
 frog1.setName("beri");
 System.out.println(frog1.getName());
		 
 
	}

}
