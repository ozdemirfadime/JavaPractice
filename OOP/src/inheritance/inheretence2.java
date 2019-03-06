package inheritance;

public class inheretence2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//call box
		Box box1 = new Box(12, 13);
		box1.displayBoxName();
		//call smalbox
		SmallBox box2 = new SmallBox(12, 13);
		box2.printAres();
		box2.displayBoxName();
		
		//calll bigbox
		BigBox box3= new BigBox(12,13,15);
		box3.displayBoxName();
		box3.printAres();
	}

}
