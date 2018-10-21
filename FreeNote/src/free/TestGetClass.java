package free;

class Animal {
}

class Dog extends Animal {
}

public class TestGetClass {
	public static void main(String args[]) {
		Animal a1 = new Dog();
		Animal a2 = new Animal();
		Animal a3 = new Animal();
		System.out.println(a1 instanceof Animal);
		System.out.println(a1.getClass() == a2.getClass());
	}
}
