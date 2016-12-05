
public class CoffeeMaker extends MainComponent {
	private static byte volumeCoffee;
	private static boolean penca = false;
	private ModesOfCoffeeMaker mode = ModesOfCoffeeMaker.Espresso;

	public CoffeeMaker() {
		name = "Кофеварка";
		state = false;
		strain = false;
	}
	
	public void modeEspresso() {
		mode = ModesOfCoffeeMaker.Espresso;
	}

	public void modeCappuccino() {
		mode = ModesOfCoffeeMaker.Cappuccino;
	}

	public void modeLatte() {
		mode = ModesOfCoffeeMaker.Latte;
	}
	
	public ModesOfCoffeeMaker getMode(){
		return mode;
	}	

	public boolean runMode(ModesOfCoffeeMaker modes, byte valCoffee, boolean pencaVal) {
		if (check()) {
			switch (modes) {
			case Espresso:
				if (valCoffee == 50 || valCoffee == 100) {
					volumeCoffee = valCoffee;
					modeEspresso();
					penca = pencaVal;
					return true;
				}
				break;
			case Cappuccino:
				if (valCoffee == 50 || valCoffee == 100) {
					volumeCoffee = valCoffee;
					modeCappuccino();
					penca = pencaVal;
					return true;
				}
				break;
			case Latte:
				if (valCoffee == 50 || valCoffee == 100) {
					volumeCoffee = valCoffee;
					modeLatte();
					penca = pencaVal;
					return true;
				}
				break;
			default:
				return false;
			}
		} else {
			return false;
		}
		return false;
	}

}
