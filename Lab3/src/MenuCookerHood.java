
public class MenuCookerHood extends MenuRealize {
	
	CookerHood cHood = new CookerHood();
	public void Select() {
		InOut.Outln(cHood.getName());
		InOut.Outln("1 - Вкл/выкл напряжение");
		InOut.Outln("2 - Вкл/выкл устройтсво");
		InOut.Outln("3 - Настройка мощности");
		InOut.Outln("Нажмите любую кнопку, чтобы вернуться в главное меню");
	}
	
	public void runMenu(){
		String selected;
		selected = InOut.In();

		switch (selected) {
		case "1": {
			cHood.stStrain();
			if (cHood.getStrain()) {
				InOut.Outln("Напряжение подключино");
			} else {
				InOut.Outln("Напряжение отключино");
			}
		}
			break;
		case "2": {
			cHood.stState();
			if (cHood.getState()) {
				InOut.Outln("Устройство включино");
			} else {
				InOut.Outln("Устройство выключино");
			}
		}
			break;
		case "3":
			if (cHood.check()) {
				menu = new MenuCookerHoodPower();
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
