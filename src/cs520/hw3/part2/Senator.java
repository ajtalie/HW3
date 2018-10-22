package cs520.hw3.part2;

public class Senator {

	//	1. Create a class named Senator as follows.
	//	a. The instance (or member) private variables � name, party, state (String),
	//	and yearsInOffice (integer).
	private String senatorName;
	private String senatorParty;
	private String senatorState;
	private int yearsInOffice;
	
	//	b. A single constructor with name as its argument.

	public Senator(String senatorName, String senatorParty, String senatorState, int yearsInOffice) {
		this.senatorName = senatorName;
		this.senatorParty = senatorParty;
		this.senatorState = senatorState;
		this.yearsInOffice = yearsInOffice;
	}

	//	c. The public get and set methods for the instance variables.
		public void setSenatorName(String x) {
			senatorName = x;
		}
		public void setSenatorParty(String y) {
			senatorParty = y;	
		}
		public void setSenatorState(String z) {
			senatorState = z;	
		}		
		public void setSenatorName(int value) {
				yearsInOffice = value;
		}
		
		public String getSenatorName() {
			return senatorName;
		}
		public String setSenatorParty() {
			return senatorParty;	
		}
		public String setSenatorState() {
			return senatorState;	
		}		
		public int setSenatorName() {
				return yearsInOffice;
		}

//		d. Override the toString method to return the string representation of this
//		object in the format �<name> (<party>) from <state> has been
//		the senator for <yearsInOffice> years�.
		@Override
		public String toString() {
			return "Senator [senatorName=" + senatorName + ", senatorParty=" + senatorParty + ", senatorState="
					+ senatorState + ", yearsInOffice=" + yearsInOffice + "]";
		}		
	
}