package hello;

abstract class Animal{
	String Animalname;
	abstract String shout() ;
}

class Dog extends Animal{
	String name;
	int age;
	String breed;
	
	public Dog(String name) {
		this.name = name;
	}

	public Dog(String name, int age) {
		super();
		this.name = name;
		this.age = age;
	}

	@Override
	String shout() {
		return "Bow Bow .......";
	}
	
}

class Bird extends Animal implements flying{

	@Override
	String shout() {
		return "chrip chrip ......";
	}

	@Override
	public void fly() {
		System.out.println("Birds will fly.....");
	}
	
}

public class demo {

	public static void main(String[] args) {
		Dog dog =new Dog("Jimmy");
		Bird bird=new Bird();
		dog.Animalname="Dog";
		System.out.println(dog.Animalname);
		Animal animal =new Animal() {

			@Override
			String shout() {
				return "Meow Meow";
			}
			
		};
		bird.fly();
		System.out.println(animal.shout());
	}		
}

interface flying{
	void fly();
}