
public class MenuAirConditioning extends MenuRealize {
	
	AirConditioning aConditioning = new AirConditioning();
	
	public void Select() {
		InOut.Outln(aConditioning.getName());
		InOut.Outln("1 - Вкл/выкл напряжение");
		InOut.Outln("2 - Вкл/выкл устройтсво");
		InOut.Outln("3 - Вкл/выкл очистку воздуха");
		InOut.Outln("Нажмите любую кнопку, чтобы вернуться в главное меню");
	}
	
	public void runMenu(){
		String selected;
		selected = InOut.In();

		switch (selected) {
		case "1": {
			aConditioning.stStrain();
			if (aConditioning.getStrain()) {
				InOut.Outln("Напряжение подключино");
			} else {
				InOut.Outln("Напряжение отключино");
			}
		}
			break;
		case "2": {
			aConditioning.stState();
			if (aConditioning.getState()) {
				InOut.Outln("Устройство включино");
			} else {
				InOut.Outln("Устройство выключино");
			}
		}
			break;
		case "3":
			if (aConditioning.check()) {
				aConditioning.stClearAir();
				if (aConditioning.getClearAir()) {
					InOut.Outln("Очистка воздуха включена");
				} else {
					InOut.Outln("Очистка воздуха выключена");
				}
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
