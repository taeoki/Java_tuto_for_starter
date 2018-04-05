package Polymorphism;

public class Tiger extends Animal implements Predator,Barkable{

	@Override
	public String getFood() {
		// TODO Auto-generated method stub
		return "apple";
	}
	public void bark()
	{
		System.out.println("brrrrr");
	}
}
