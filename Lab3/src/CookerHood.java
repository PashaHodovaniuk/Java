public class CookerHood extends MainComponent {
	private static byte power = 0;

	public CookerHood() {
		name = "Вытяжка";
		state = false;
		strain = false;
	}

	public void stPower() {
		if (power == 3) {
			power = 0;
		} else {
			power++;
		}
	}

	public byte getPower() {
		return power;
	}

}
