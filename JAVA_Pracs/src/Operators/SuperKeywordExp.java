package Operators;

class Animal {
	public Animal() {
		System.out.println("Animal");
	}
}

class Cat extends Animal {
	
	public Cat() {
		System.out.println("Cat");
	}
}
public class SuperKeywordExp {

	public static void main(String[] args) {
		new Cat();
	}

}
