package Polymorphism;

public class Lion extends Animal implements BarkablePredator{

	@Override
	public String getFood() {
		// TODO Auto-generated method stub
		return "banana";
	}
	
	public void bark() {
		System.out.println("krrrr");
	}
	
}
