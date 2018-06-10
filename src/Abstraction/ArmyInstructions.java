package Abstraction;

public class ArmyInstructions implements Enemy, TestInterface{
	@Override
	public void speak() {
		// TODO Auto-generated method stub
		System.out.println("Solders should not take name and user codewords");
	}
	@Override
	public void moveTo(int x, int y) {
		// TODO Auto-generated method stub
		System.out.println("Enemy entered in the teritory and standing at " + x + "and" + y + "cordinates");
	}

	@Override
	public void attack(String code) {
		// TODO Auto-generated method stub
		System.out.println("Whenever needed solders should attack: " + code);
	}

	@Override
	public void heal(int percentage) {
		// TODO Auto-generated method stub
		System.out.println("his concern is to heal sick people" + percentage);
	}

	@Override
	public void eventOnDeath() {
		// TODO Auto-generated method stub
		System.out.println("In case of death: ");
	}
	@Override
	public void sameplecode() {
		// TODO Auto-generated method stub
		System.out.println("Sample code");
	}
public static void main(String[] args) {
	ArmyInstructions A1 = new ArmyInstructions();
	A1.speak();
	A1.moveTo(1, 2);
	A1.attack("Code");
	A1.heal(12);
	A1.eventOnDeath();
	A1.sameplecode();
}
}
