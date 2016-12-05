
public class CoffeeMarkerAdapter {
	private CoffeeMaker coffee = new CoffeeMaker();
	
	public void stState(){
		coffee.stState();
	}
	
	public void stStrain(){
		coffee.stStrain();
	}
	
	public boolean gState(){
		return coffee.getState();
	}
	
	public boolean gStrain(){
		return coffee.getStrain();
	}
	
	public String gName(){
		return coffee.getName();
	}
	
	public ModesOfCoffeeMaker gMode(){
		return coffee.getMode();
	}
	
	public boolean run(ModesOfCoffeeMaker modes, byte  valCoffee, boolean pencaVal)
	{
		return coffee.runMode(modes, valCoffee, pencaVal);				
	}

}
