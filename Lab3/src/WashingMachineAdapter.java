public class WashingMachineAdapter {
	private WashingMachine wMachine = new WashingMachine();

	public void stState() {
		wMachine.stState();
	}

	public void stStrain() {
		wMachine.stStrain();
	}

	public void stWState() {
		wMachine.stWState();
	}

	public byte gWState() {
		return wMachine.getWState();
	}

	public boolean gState() {
		return wMachine.getState();
	}

	public boolean gStrain() {
		return wMachine.getStrain();
	}

	public String gName() {
		return wMachine.getName();
	}

}
