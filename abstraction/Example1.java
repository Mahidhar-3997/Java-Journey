public class Example1 {

	public static void main(String[] args) {

        Animal a1;
        a1 = new Tiger();
        a1.eat();
        a1.makeSound();
	}

}
abstract class Animal{
	abstract void eat();
	abstract void makeSound();
}
class Tiger extends Animal {
	
	void eat() {
        System.out.println("tiger ate non veg");
	}
	void makeSound() {
        System.out.println("Tiger make sound");
	}
}
