package jump2java;

public class Lion extends Animal implements BarkablePredetor{
	public String getFood() {
		return "banana";
	}
	
	public void bark() {
		System.out.println("growl");
	}
}
