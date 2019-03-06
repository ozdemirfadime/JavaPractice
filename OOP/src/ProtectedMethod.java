import java.security.Permission;

import accesmodifiers.Person;

public class ProtectedMethod  extends  Person{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
   ProtectedMethod p1 = new ProtectedMethod();
   p1.great("call");//proted method
   p1.great("stephen");// public method
    
   
	}

}
