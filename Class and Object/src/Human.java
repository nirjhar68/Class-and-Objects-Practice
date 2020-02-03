
public class Human {
	String name;
	int age;
	double height;
	String hairColor;
	
	public Human(String n, int a, double h, String hColor) {
		this.name = n;
		this.age = a;
		this.height = h;
		this.hairColor = hColor;
	}
	
	public void intro() {
		System.out.println("Hello my name is " + name);
		System.out.println("My age is " + age);
		System.out.println("My height is " + height);
		System.out.println("My hair color is " + hairColor);
		
	}
	
	public static void main(String[] args) {
		System.out.println("Hello world");
		/*Human human = new Human();
		human.intro();*/
	}

}
