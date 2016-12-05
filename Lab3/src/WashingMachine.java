public class WashingMachine extends MainComponent {
	private static byte wState = 0;

	public WashingMachine() {
		name = "Стиральная машинка";
		state = false;
		strain = false;
	}

	public void stWState() {
		if (wState == 4) {
			wState = 0;
		} else {
			wState++;
		}
	}

	public byte getWState() {
		return wState;
	}
}