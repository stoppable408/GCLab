
public class Emperor {
	private String firstName;
	private String lastName;
	private String timeInOffice;
	private String death;
	
	
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public String getTimeInOffice() {
		return timeInOffice;
	}
	public void setTimeInOffice(String timeInOffice) {
		this.timeInOffice = timeInOffice;
	}
	public String getDeath() {
		return death;
	}
	public void setDeath(String death) {
		this.death = death;
	}
	
	public static Emperor[] populateArray(){
	Emperor[] emperorArray = new Emperor[9];
	
	Emperor augustus = new Emperor();
	augustus.setFirstName("Caesar");
	augustus.setLastName("Augustus");
	augustus.setTimeInOffice("40 Years, 7 Months, and 3 Days");
	augustus.setDeath("August 19th, 14 AD");
	emperorArray[0] = augustus;
	
	Emperor tiberius = new Emperor();
	tiberius.setFirstName("Tiberius");
	tiberius.setLastName("Augustus");
	tiberius.setTimeInOffice("22 Years, 5 Months and 27 Days");
	tiberius.setDeath("March 16th, 37 AD");
	emperorArray[1] = tiberius;
	
	Emperor caligula = new Emperor();
	caligula.setFirstName("Caligula");
	caligula.setLastName("Germanicus");
	caligula.setTimeInOffice("3 Years, 10 Months, and 6 Days");
	caligula.setDeath("January 24th, 41 AD");
	emperorArray[2] = caligula;
	
	Emperor claudius = new Emperor();
	claudius.setFirstName("Claudius");
	claudius.setLastName("Germanicus");
	claudius.setTimeInOffice("13 Years, 8 Months, and 18 Days");
	emperorArray[3] = claudius;
	
	
	Emperor nero = new Emperor();
	nero.setFirstName("Nero");
	nero.setLastName("Germanicus");
	nero.setTimeInOffice("13 Years, 7 Months, and 27 Days");
	nero.setDeath("June 9th, 68 AD");
	emperorArray[4] = nero;
	
	Emperor galba = new Emperor();
	galba.setFirstName("Galba");
	galba.setLastName("Augustus");
	galba.setTimeInOffice("7 Months and 7 Days");
	galba.setDeath("January 15th, 69 AD");
	emperorArray[5] = galba;
	
	
	return emperorArray;
	}
	
	
}
