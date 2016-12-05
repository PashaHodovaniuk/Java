public class MenuOven extends MenuRealize {
	Oven oven = new Oven();

	public void Select() {
		InOut.Outln(oven.getName());
		InOut.Outln("1 - Вкл/выкл напряжение");
		InOut.Outln("2 - Вкл/выкл устройтсво");
		InOut.Outln("3 - Настройка температуры");
		InOut.Outln("Нажмите любую кнопку, чтобы вернуться в главное меню");
	}

	public void runMenu() {
		String selected;
		selected = InOut.In();

		switch (selected) {
		case "1": {
			oven.stStrain();
			if (oven.getStrain()) {
				InOut.Outln("Напряжение подключино");
			} else {
				InOut.Outln("Напряжение отключино");
			}
		}
			break;
		case "2": {
			oven.stState();
			if (oven.getState()) {
				InOut.Outln("Устройство включино");
			} else {
				InOut.Outln("Устройство выключино");
			}
		}
			break;
		case "3":
			if (oven.check()) {
				menu = new MenuOvenTemperature();
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
