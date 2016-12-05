public class MenuCoffeeMaker extends MenuRealize {

	CoffeeMaker cMaker = new CoffeeMaker();
	
	public void Select() {
		InOut.Outln(cMaker.getName());
		InOut.Outln("1 - Вкл/выкл напряжение");
		InOut.Outln("2 - Вкл/выкл устройтсво");
		InOut.Outln("3 - Выбор напитка");
		InOut.Outln("4 - Выбор объема");
		InOut.Outln("5 - Наличие пенки");
		InOut.Outln("Нажмите любую кнопку, чтобы вернуться в главное меню");
	}

	public void runMenu() {
		
		String selected;
		selected = InOut.In();

		switch (selected) {
		case "1": {
			cMaker.stStrain();
			if (cMaker.getStrain()) {
				InOut.Outln("Напряжение подключино");
			} else {
				InOut.Outln("Напряжение отключино");
			}
		}
			break;
		case "2": {
			cMaker.stState();
			if (cMaker.getState()) {
				InOut.Outln("Устройство включино");
			} else {
				InOut.Outln("Устройство выключино");
			}
		}
			break;
		case "3":
			if (cMaker.check()) {
				menu = new MenuCoffeeMakerMode();
			} else {
				InOut.Outln("Не было включино устройство или не подключино напряжение");
			}
			break;
		case "4":
			if (cMaker.check()) {
				menu = new MenuCoffeeMakerVolumeCoffee();
			} else {
				InOut.Outln("Не было включино устройство или не подключино напряжение");
			}
			break;
		case "5":
			if (cMaker.check()) {
				menu = new MenuCoffeeMakerPenca();
			} else {
				InOut.Outln("Не было включино устройство или не подключино напряжение");
			}
			break;
		default:
			menu = new Menu();
			break;
		}
	}

}