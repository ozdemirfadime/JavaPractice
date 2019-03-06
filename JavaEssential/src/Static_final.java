package deneme;
class Thing{
	 public final static  int LUCKY_NUMBER= 8;
	public String name;
	public static String description;
	

 public void showName() {
	 System.out.println("onject id: "+ id + description+ " " + name);
 }
 public static void showInfo() {
	 System.out.println(description );
	// wont work System.out.println(name);
 }
  public static int count =0;
   public int id;
  public Thing()
  {   id =count;
  
	  count++;
  }
}


public class Static_final {

	public static void main(String[] args) {
		
		Thing.description = " ı am thing";
		Thing.showInfo();
		System.out.println("brfore creatiing object count is:" +Thing.count);
		Thing thing1 =new Thing();
		Thing thing2 = new Thing();
		System.out.println("after creatiing object count is:" +Thing.count);
		thing1.name="bob";
		thing2.name="sud";
		//System.out.println(thing1.name);
		thing1.showName(); 
		thing2.showName();
		System.out.println(Math.PI);
		System.out.println(Thing.LUCKY_NUMBER);
		
	}

}
