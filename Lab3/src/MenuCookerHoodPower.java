public class MenuCookerHoodPower extends MenuRealize {
	CookerHood cHood = new CookerHood();

	public void Select() {
		InOut.Outln(cHood.getName());
		InOut.Outln("1 - Следующий уровень мощности");
		InOut.Outln("Нажмите любую кнопку, чтобы вернуться в прошлое меню");
	}

	public void runMenu() {

		InOut.Outln("Текущая мощность: " + cHood.getPower());
		String selected;
		selected = InOut.In();

		switch (selected) {
		case "1": {
			cHood.stPower();
		}
			break;
		default:
			menu = new MenuCookerHood();
			break;
		}
	}
}
