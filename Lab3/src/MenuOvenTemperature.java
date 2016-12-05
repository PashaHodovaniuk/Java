public class MenuOvenTemperature extends MenuRealize {
	Oven oven = new Oven();

	public void Select() {
		InOut.Outln(oven.getName());
		InOut.Outln("1 - Повысить температуру");
		InOut.Outln("2 - Понизить температуру");
		InOut.Outln("Нажмите любую кнопку, чтобы вернуться в прошлое меню");
	}

	public void runMenu() {

		Oven oven = new Oven();
		InOut.Outln("Текущая температура: " + oven.getTemperature());
		String selected;
		selected = InOut.In();

		switch (selected) {
		case "1": {
			oven.incTemperature();
		}
			break;
		case "2": {
			oven.decTemperature();
		}
			break;
		default:
			menu = new MenuOven();
			break;
		}

	}

}