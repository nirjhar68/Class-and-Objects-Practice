import java.util.*;
import SomeOtherPackage.Circle;
public class Square {
	static String squareColor;
	static int side;
	static int areaOfSquare;
	static String squareName;
	
	public static Scanner input= new Scanner(System.in);
	//public Square A = new Square();
	
	public static void main(String[] args) {
		System.out.println("Please name the Square...  ");
	    squareName = input.nextLine();
	    System.out.println("\nPlease enter the side...  ");
	    side = input.nextInt();
	    areaOfSquare = returnArea(side);
	    System.out.println("The area is " + areaOfSquare + "\n");
	    //Can call the method called from printTheCircle() from the Circle class is another class by importing the package, SomeOtherPackage
	    Circle.pritTheCircle();
	    System.out.println("Try the non static method now.\n");
	    
	    //Create an instance of Square
	    Square g = new Square();
	    //Calling the method area() with the instance
	    g.area(5);
	    System.out.println("The non static method are is " + g.area(5));
		
	} 
	
	public static int returnArea(int s) {
		return (s*s);
	}
	
	
	public static void provideInfo() {
		System.out.println("\n\nSquare name is " + squareName + "and the Area is " + areaOfSquare);
	}
	
	//A non static method
	private int area(int a) {
		return a*a;
	}
}

