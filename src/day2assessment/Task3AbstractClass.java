package day2assessment;
abstract class Animal
{
	String color;
	abstract void color();
}
class Dog extends Animal
{
	Dog(String a)
	{
		color = a;
	}
	void color()
	{
		System.out.println("The color of dog is : "+color);
	}
}
public class Task3AbstractClass {
	public static void main(String[] args) {
		Dog obj1 = new Dog("black");
		obj1.color();
		Dog obj2 = new Dog("brown");
		obj2.color();

	}
}
