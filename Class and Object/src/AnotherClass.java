
public class AnotherClass {

	public static void main(String[] args) {
		// Declaring another instance of square object
		Square b;
		//Square() is the constructor for the class Square in line assignment should look like Square b = new Square();
		b = new Square();
		System.out.println("This is the AnotherClass\n");
		b.side = 5;
		//calling a function from the class Square which is a static function and printing the return
		System.out.println(b.returnArea(b.side));
		
		

	}

}
