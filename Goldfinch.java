
public class Goldfinch extends Animal implements Flyable, Walkable{
	
	private double wingSpan;
	
	public Goldfinch() {
		super();
		this.wingSpan = 9.0;
		
	} //end empty-argument constructor
	
	public Goldfinch(int simID, Location location, double wingSpan) throws InvalidWingspanException, InvalidSimIDException {
		super(simID, location);
		if (wingSpan < 5.0 || wingSpan > 11.0) {
			throw new InvalidWingspanException("Wingspan must be between 5.0 and 11.0 cm.");
		}
		this.wingSpan = wingSpan;
		
	} //end preferred constructor

	//Getters and setters
	public double getWingSpan() {
		return wingSpan;
		
	} //end getWingSpan

	public void setWingSpan(double wingSpan) throws InvalidWingspanException {
		if (wingSpan < 5.0 || wingSpan > 11.0) {
			throw new InvalidWingspanException("Wingspan must be between 5.0 and 11.0 cm.");
		}
		this.wingSpan = wingSpan;
		
	} //end setWingSpan

	@Override
	public String toString() {
		return "Goldfinch [wingSpan=" + wingSpan + ", simID=" + simID + ", location=" + location + ", full=" + full
				+ ", rested=" + rested + "]";
		
	} //end toString

	@Override
	public void walk(int direction) {
		
		// Move 1 unit in the direction specified
        Location current = getLocation();
        switch (direction) {
            case 0: try {
				current.update(current.getCoordinates()[0] + 1, current.getCoordinates()[1]);
			} catch (InvalidCoordinateException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} break; // move right
            case 1: try {
				current.update(current.getCoordinates()[0] - 1, current.getCoordinates()[1]);
			} catch (InvalidCoordinateException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} break; // move left
            case 2: try {
				current.update(current.getCoordinates()[0], current.getCoordinates()[1] + 1);
			} catch (InvalidCoordinateException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} break; // move up
            case 3: try {
				current.update(current.getCoordinates()[0], current.getCoordinates()[1] - 1);
			} catch (InvalidCoordinateException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} break; // move down
            
        }
    } //end walk
		

	@Override
	public void fly(Location newLocation) {
		setLocation(newLocation);
		
	} //end fly
	
	
} //end class
