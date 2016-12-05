public class Menu extends MenuRealize {

	public void Select() {
		InOut.Outln("1 - Кофеварка");
		InOut.Outln("2 - Духовка");
		InOut.Outln("3 - Кондиционер");
		InOut.Outln("4 - Вытяжка");
		InOut.Outln("5 - Стиральная машинка");
	}

	public void runMenu() {

		String selected;
		selected = InOut.In();

		switch (selected) {
		case "1":
			menu = new MenuCoffeeMaker();
			break;
		case "2":
			menu = new MenuOven();
			break;
		case "3":
			menu = new MenuAirConditioning();
			break;
		case "4":
			menu = new MenuCookerHood();
			break;
		case "5":
			menu = new MenuWashingMachine();
			break;
		default:
			break;
		}
	}
}
