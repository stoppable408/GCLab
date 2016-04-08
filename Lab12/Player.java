
public abstract class Player {

	String name;
	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	Roshambo choice;
	
	
	abstract Roshambo generateRoshambo();
	
	
}
