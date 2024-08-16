
public abstract class Animal {
	
	protected int simID;
	protected Location location;
	protected boolean full;
	protected boolean rested;
	
	public Animal() {
		this.simID = 0;
		this.location = new Location();
		this.full = false;
		this.rested= true;
	} //end empty-argument constructor
	
	public Animal(int simID, Location loction) throws InvalidSimIDException {
		
		if (simID <= 0) {
			throw new InvalidSimIDException("Simulation ID must be greater than zero.");
		}
		this.simID = simID;
		this.location = location;
		this.full = false;
		this.rested = true;
	} //end preferred constructor
	
	public void eat() {
		
		this.full = Math.random() > 0.5;
	} //end eat
	
	public void sleep() {
		
		this.rested = Math.random() > 0.5;
	} //end sleep
	
	//Getters and Setters

	public int getSimID() {
		
		return simID;
	} //end getSimID

	public void setSimID(int simID) throws InvalidSimIDException {
		
		if (simID <= 0) {
			throw new InvalidSimIDException("Simulation must be greater than zero.");
		}
		this.simID = simID;
	} //end setSimID

	public Location getLocation() {
		return location;
	} //end getLocation

	public void setLocation(Location location) {
		
		this.location = location;
	} //end setLocation

	public boolean isFull() {
		
		return full;
	} //end isFull

	public void setFull(boolean full) {
		
		this.full = full;
	} //end set full

	public boolean isRested() {
		
		return rested;
	} //end isRested

	public void setRested(boolean rested) {
		
		this.rested = rested;
	} //end setRested
	
	

} //end class

