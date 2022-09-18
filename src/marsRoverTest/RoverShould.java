package marsRoverTest;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import marsRover.Plateau;
import marsRover.Rover;

class RoverShould {

	@Test
	void SpinLeft() {
		//assertTrue(false);
		//arrange set up task
		Rover rover = new Rover("1 2 N", new Plateau(5,5));
		rover.SpinLeft();
		assertEquals("W", rover.getDirection());// testing instruction to verified if test pass or not	
	}
}