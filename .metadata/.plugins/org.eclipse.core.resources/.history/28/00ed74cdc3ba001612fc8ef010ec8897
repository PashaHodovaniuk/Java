public class Oven extends MainComponent {
	private static int temperature = 90;

	public Oven() {
		name = "Вытяжка";
		state = false;
		strain = false;
	}

	public void decTemperature() {
		if (temperature <= 90) {
			temperature = 90;
		} else {
			temperature -= 5;
		}
	}
	
	public void incTemperature() {
		if (temperature >= 300) {
			temperature = 300;
		} else {
			temperature += 5;
		}
	}

	public int getTemperature() {
		return temperature;
	}

}
