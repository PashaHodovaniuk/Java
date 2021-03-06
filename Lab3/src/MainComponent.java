
public class MainComponent {
	protected String name; // Имя
	protected boolean state; // Состояние вкл/выкл
	protected boolean strain; // Напряжение (электричество)

	protected boolean check() {
		return state && strain;
	}
	
	public String getName(){
		return name;
	}

	public void stStrain() {
		strain = !strain;
	}	

	public boolean getStrain() {
		return strain;
	}

	public void stState() {
		state = !state;
	}

	public boolean getState() {
		return state;
	}

}
