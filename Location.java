
public class Location {
	
	private int xCoord;
	private int yCoord;
	
	public Location() {
		this.xCoord = 0;
		this.yCoord = 0;
		
	} //end empty-argument constructor 
	
	public Location (int xCoord, int yCoord) throws InvalidCoordinateException {
		
		if (xCoord < 0 || yCoord < 0) {
			throw new InvalidCoordinateException("Coordinate cannot be less than 0!");
		}
		this.xCoord = xCoord; 
		this.yCoord = yCoord;
		
	} //end preferred constructor
	
	public void update(int xCoord, int yCoord) throws InvalidCoordinateException {
		if (xCoord < 0 || yCoord < 0) {
			throw new InvalidCoordinateException("Coordinate cannot be less than 0!");
		}
		this.xCoord = xCoord; 
		this.yCoord = yCoord;
		
	} //end update
	
	public int[] getCoordinates() {
		return new int[] {xCoord, yCoord};
		
	} //end getCoordinates

	@Override
	public String toString() {
		return "Location [xCoord=" + xCoord + ", yCoord=" + yCoord + "]";
	} //end toString
	
	

} //end class
