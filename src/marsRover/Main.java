package marsRover;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Scanner;

//Rover : Position and location represented by (x, y, z), where Z in {N, E, W, S}
	//plateau: Grid of position following the format (x,y,z) where (0, 0, N) => (x=0, y=0, Z=N)
	//	       MaximumCoordinates => (maxX, maxY) => (5 5)
	// Message: (LLLRRMM)  => (L=SpinLeft, SpinRight, M=MovedForward)
	// Input = 5 lines:
	// 1. Plateau Size: (5 5)
	// 2. Array of RoverInstruction objects, where RoverInstruction object contains:
	//		a. RoverPosition (first line)
	//		b. RoverCommand (second line)
	
	// Expected Behaviors:
	// 1. Rover Should Spin Left
	// 2. Rover Should Spin Right
	// 3. Rover Should Spin Forward	
    // 4. Rover Should Move
	   
public class Main {

	public static void main(String[] args) throws FileNotFoundException {
	    
		//get the text file passed as an argument
	    Scanner reader = new Scanner(new FileInputStream(args[0]));
	    while(reader.hasNext()) { //for each line of the file
	    	
	    	String position_rover = reader.nextLine(); //get a position of the rover
	    	Rover rover = new Rover(position_rover, new Plateau(5,5));
	    	
	    	String instruction_rover = reader.nextLine();//get instruction of the rover
			rover.Move(instruction_rover);
			System.out.println(rover.getX() +" "+rover.getX() +" "+rover.getDirection());
	    }
	}
}
