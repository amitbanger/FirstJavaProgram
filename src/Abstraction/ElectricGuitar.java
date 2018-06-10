package Abstraction;

public class ElectricGuitar extends StringInstrument{
	public ElectricGuitar()
	{
		super();
		this.name = "Guitar";
		this.numberOfString = 6;
	}
	public ElectricGuitar(int numberOfString) {
		super();
		this.name = "Guitar";
		this.numberOfString = numberOfString;

	}
	@Override
	public void play() {
		// TODO Auto-generated method stub
		System.out.println("An electric " + numberOfString + "-string" + name + " is rocking ");	
	}
	@Override
	public void Instrument1() {
		// TODO Auto-generated method stub

	}

	// abstract public void m1();
	//{		 
	//}
}
