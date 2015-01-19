package intro;

public class Dog extends Animal{
	
	public void digHole() {
		System.out.println("Dug a hole");
	}
	
	public Dog() {
		super();
		
		setSound("Bark");
	}
	
	private void bePrivate() {
		System.out.println("In private!");
	}
	
	public void accessPrivate() {
		bePrivate();
	}
}
