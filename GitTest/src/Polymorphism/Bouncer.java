package Polymorphism;


public class Bouncer {
	public void barkAnimal(Barkable animal) {
		animal.bark();
	}
	public static void main(String[] args) {
		Tiger tiger = new Tiger();
		Lion lion = new Lion();
		
		Bouncer bouncer = new Bouncer();
		bouncer.barkAnimal(tiger);
		bouncer.barkAnimal(lion);
		
		/*
		 * Tiger tiger = new Tiger();
		 * Animal animal = new Tiger();
		 * Predator predator = new Tiger();
		 * Barkable barkable = new Tiger();
		 */
		
	}
}
