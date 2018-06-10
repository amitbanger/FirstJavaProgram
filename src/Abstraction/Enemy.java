package Abstraction;

public interface Enemy {
	public abstract void speak();
	public void moveTo(int x, int y);
	public void attack(String code);
	public void heal(int percentage);
	public void eventOnDeath();
	
	//public void amit{
		//System.out.println();
	//}
	
	//public Enemy() {
		
//	}
}
