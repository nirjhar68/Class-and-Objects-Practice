
public class Student {

	public static void main(String[] args)throws Exception {
		//calling the default constructor
		//Human student1 = new Human();
		//Human student2 = new Human();
		
		//Dynamically entering the values of the instance
		
		Human student3 = new Human("Bob", 25, 1.6, "Black");
		Human student4 = new Human("Paul", 24, 1.5, "Red");
		Human student5 = new Human("Muhammad", 23, 1.7, "Black");
		
		//student1.intro();
		//student2.intro();
		
		student3.intro();
		student4.intro();
		student5.intro();
		

	}

}
