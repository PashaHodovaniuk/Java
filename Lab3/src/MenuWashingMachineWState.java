
public class MenuWashingMachineWState extends MenuRealize {

	WashingMachine wMachine = new WashingMachine();
	String[] mode = {"Деликатная","Синтетика","Хлопок","Отжим","Полоскание"};

	public void Select() {
		InOut.Outln(wMachine.getName());
		InOut.Outln("1 - Следующий режим");
		InOut.Outln("Нажмите любую кнопку, чтобы вернуться в главное меню");
	}

	public void runMenu() {
		InOut.Outln("Текущий ражим: " + mode[wMachine.getWState()]);
		String selected;
		selected = InOut.In();

		switch (selected) {
		case "1": {
			wMachine.stWState();
			
		}
			break;
		default:
			menu = new MenuWashingMachine();
			break;
		}

	}

}
