
public class BrownBear extends Animal implements Walkable, Swimmable{
	
	private String subSpecies;
	
	public BrownBear() {
		super();
		this.subSpecies = "Alaskan";
		
	} //end empty-argument constructor
	
	public BrownBear(int simID, Location location, String subSpecies) throws InvalidSubspeciesException, InvalidSimIDException {
		super(simID, location);
		if (!isValidSubSpecies(subSpecies)) {
			throw new InvalidSubspeciesException("Invalid species: " + subSpecies);
		}
		this.subSpecies = subSpecies;
		
	} //end preferred constructor

	
	//Getters and Setters
	public String getSubSpecies() {
		return subSpecies;
	} //end getSubSpecies

	public void setSubSpecies(String subSpecies) throws InvalidSubspeciesException {
		if (!isValidSubSpecies(subSpecies)) {
			throw new InvalidSubspeciesException("Invalid species: " + subSpecies);
		}
		this.subSpecies = subSpecies;
	} //end setSubSpecies
	
	private boolean isValidSubSpecies(String subSpecies) {
		return subSpecies.equals("Alaskan") || subSpecies.equals("Asiatic") || subSpecies.equals("European") || subSpecies.equals("Grizzly") || subSpecies.equals("Kodiak") || subSpecies.equals("Siberian");
		
	} //end isValudSpecies

	@Override
	public String toString() {
		return "BrownBear [subSpecies=" + subSpecies + ", simID=" + simID + ", location=" + location + ", full=" + full
				+ ", rested=" + rested + "]";
		
	} //end toString

	@Override
	public void swim(int direction) throws InvalidCoordinateException {
		 // Move 2 units in the direction specified
        Location current = getLocation();
        switch (direction) {
            case 0: current.update(current.getCoordinates()[0] + 2, current.getCoordinates()[1]); break; // move right
            case 1: current.update(current.getCoordinates()[0] - 2, current.getCoordinates()[1]); break; // move left
            case 2: current.update(current.getCoordinates()[0], current.getCoordinates()[1] + 2); break; // move up
            case 3: current.update(current.getCoordinates()[0], current.getCoordinates()[1] - 2); break; //move down
            
         }
	} //end swim

	@Override
	public void walk(int direction) throws InvalidCoordinateException {
		// Move 3 units in the direction specified
        Location current = getLocation();
        switch (direction) {
            case 0: current.update(current.getCoordinates()[0] + 3, current.getCoordinates()[1]); break; // move right
            case 1: current.update(current.getCoordinates()[0] - 3, current.getCoordinates()[1]); break; // move left
            case 2: current.update(current.getCoordinates()[0], current.getCoordinates()[1] + 3); break; // move up
            case 3: current.update(current.getCoordinates()[0], current.getCoordinates()[1] - 3); break; // move down
            
        }
    }	//end walk	

} //end class
