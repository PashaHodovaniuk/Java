public class OvenAdapter {
	private Oven cHood = new Oven();

	public void stState() {
		cHood.stState();
	}

	public void stStrain() {
		cHood.stStrain();
	}

	public void decTemperature() {
		cHood.decTemperature();
	}
	
	public void incTemperature() {
		cHood.incTemperature();
	}

	public int gTemperature() {
		return cHood.getTemperature();
	}

	public boolean gState() {
		return cHood.getState();
	}

	public boolean gStrain() {
		return cHood.getStrain();
	}

	public String gName() {
		return cHood.getName();
	}

}
