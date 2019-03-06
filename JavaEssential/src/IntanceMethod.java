
class Student{
	public void name_student(String name) {
		// TODO Auto-generated method stub
		System.out.println(String.format("student name ,%s",name));

	}
	public void grade(double grade)
	{
		System.out.println(String.format("grade is :%.2f",grade));
	}
	//static method 
	public static void className(String name ) {
		System.out.println(String.format("class name is %s",name));
	}
	
	
}
public class IntanceMethod {

	public static void main(String[] args) {
		Student st1 = new Student();
         st1.name_student("stanny");
          st1.grade(2.11);
          Student.className("student 1");
          
          Student st2 = new Student();
          /*st2.name_student("nina");
          st2.grade(1.1);*/
         Student.className("student 2");
          
	}

}
