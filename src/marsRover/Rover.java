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
	
	public void StepForward() {
		
		switch(this.direction) {
			case "N":
				if(y < this.plateau.upper_limit_y) 
					y += 1;
				break;
			case "E":
				if(x < this.plateau.upper_limit_x) 
					x += 1;
				break;
			case "S":
				if(y > this.plateau.lower_limit_y) 
					y -= 1;
				break;
			case "W":
				if(x > this.plateau.lower_limit_x) 
					x -= 1;
				break;
			default:
				throw new RuntimeException("Unable to stepForward the direction value is not good");
		}
   } 
	
	 public void Move(String roverCommand) {
		   
		  char[] instructions = roverCommand.toCharArray();
		  //loop through array for each letter, call SpinLeft, SpinRight, StepForward
		  for(int i = 0; i < instructions.length; i++) {
			  
			  switch(instructions[i]) {
				case 'L':
					this.SpinLeft();
					break;
				case 'R':
					this.SpinRight();
					break;
				case 'M':
					this.StepForward();
					break;
				default:
					throw new RuntimeException("Unable to move instruction value is not good");
			}
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
