
public class MenuWashingMachine extends MenuRealize {
	
	WashingMachine wMachine = new WashingMachine();
	
	public void Select() {
		InOut.Outln(wMachine.getName());
		InOut.Outln("1 - Вкл/выкл напряжение");
		InOut.Outln("2 - Вкл/выкл устройтсво");
		InOut.Outln("3 - Выбор режима");
		InOut.Outln("Нажмите любую кнопку, чтобы вернуться в главное меню");
	}
	
	public void runMenu(){
		
		String selected;
		selected = InOut.In();

		switch (selected) {
		case "1": {
			wMachine.stStrain();
			if (wMachine.getStrain()) {
				InOut.Outln("Напряжение подключино");
			} else {
				InOut.Outln("Напряжение отключино");
			}
		}
			break;
		case "2": {
			wMachine.stState();
			if (wMachine.getState()) {
				InOut.Outln("Устройство включино");
			} else {
				InOut.Outln("Устройство выключино");
			}
		}
			break;
		case "3":
			if (wMachine.check()) {
				menu = new MenuWashingMachineWState();
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
