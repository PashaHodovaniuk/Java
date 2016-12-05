
public class MenuCoffeeMakerMode extends MenuRealize {

	CoffeeMaker cMaker = new CoffeeMaker();
	@Override
	public void Select() {
		InOut.Outln(cMaker.getName());
		InOut.Outln("1 - Эспрессо");
		InOut.Outln("2 - Капучино");
		InOut.Outln("3 - Латте");
		InOut.Outln("Нажмите любую кнопку, чтобы вернуться в главное меню");
	}

	@Override
	public void runMenu() {
		String selected;
		selected = InOut.In();

		switch (selected) {
		case "1": 
			cMaker.modeEspresso();		
			break;
		case "2": 
			cMaker.modeCappuccino();	
			break;
		case "3":
			cMaker.modeLatte();
			break;
		default:
			menu = new Menu();
			break;
		}

	}

}
