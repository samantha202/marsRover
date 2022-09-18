package marsRover;

public class Rover {
	
	private int x; //x coordinate of the current rover position
	private int y; // y coordinate of the current rover position
	private String direction; // cardinal direction of the current rover position
	private Plateau plateau; //rectangular plateau on Mars

	Rover(){
	}
	
	public Rover(String location, Plateau plateau) {
		
		String[] arrOfLocation = location.split(" ", 3);
		 this.x = Integer.parseInt(arrOfLocation[0]);
		 this.y = Integer.parseInt(arrOfLocation[1]);
		 this.direction = arrOfLocation[2];
		 this.plateau = plateau;
	}
}
