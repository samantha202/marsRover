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
	public void SpinLeft() {
			
		switch(this.direction) {
			
			case "N":
				this.direction = "W";
				break;
			case "E":
				this.direction = "N";
				break;
			case "S":
				this.direction = "E";
				break;
			case "W":
				this.direction = "S";
				break;
			default:
				throw new RuntimeException("Unable to rotate the direction value is not good");	
		}
	}
	
	public void SpinRight() {
			
		switch(this.direction) {
			
			case "N":
				this.direction = "E";
				break;
			case "E":
				this.direction = "S";
				break;
			case "S":
				this.direction = "W";
				break;
			case "W":
				this.direction = "N";
				break;
			default:
				throw new RuntimeException("Unable to rotate the direction value is not good");	
			}
		}

	public int getX() {
		return x;
	}

	public void setX(int x) {
		this.x = x;
	}

	public int getY() {
		return y;
	}

	public void setY(int y) {
		this.y = y;
	}

	public String getDirection() {
		return direction;
	}

	public void setDirection(String direction) {
		this.direction = direction;
	}

	public Plateau getPlateau() {
		return plateau;
	}

	public void setPlateau(Plateau plateau) {
		this.plateau = plateau;
	}
}
