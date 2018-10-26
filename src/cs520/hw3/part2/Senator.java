package cs520.hw3.part2;

public class Senator {

	//	1. Create a class named Senator as follows.
	//	a. The instance (or member) private variables – name, party, state (String),
	//	and yearsInOffice (integer).
	private String senatorName;
	private String senatorParty;
	private String senatorState;
	private int yearsInOffice;
	
	//	b. A single constructor with name as its argument.

	public Senator(String senatorName, int yearsInOffice, String senatorParty, String senatorState) {
		this.senatorName = senatorName;
		this.senatorParty = senatorParty;
		this.senatorState = senatorState;
		this.yearsInOffice = yearsInOffice;
	}

	//	c. The public get and set methods for the instance variables.
	// Setters for the method	
	public void setSenatorName(String name) {
		senatorName = name;
	}
	public void setSenatorParty(String party) {
		senatorParty = party;	
	}
	public void setSenatorState(String state) {
		senatorState = state;	
	}		
	public void setYearsInOffice(int value) {
		yearsInOffice = value;
	}
	// Setters for the method	
	public String getSenatorName() {
		return senatorName;
	}
	public String setSenatorParty() {
		return senatorParty;	
	}
	public String setSenatorState() {
		return senatorState;	
	}		
	public int setSenatorYearsInOffice() {
		return yearsInOffice;
	}

//		d. Override the toString method to return the string representation of this
//		object in the format “<name> (<party>) from <state> has been
//		the senator for <yearsInOffice> years”.
		@Override
		public String toString() {
			return "Senator " + senatorName + " (" + senatorParty + ") from "
					+ senatorState + " has been the senator for " + yearsInOffice + " years.";
		}		
	
}
