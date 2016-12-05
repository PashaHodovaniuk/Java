public class CookerHoodAdapter {
	private CookerHood cHood = new CookerHood();

	public void stState() {
		cHood.stState();
	}

	public void stStrain() {
		cHood.stStrain();
	}

	public void stPower() {
		cHood.stPower();
	}

	public byte gPower() {
		return cHood.getPower();
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
