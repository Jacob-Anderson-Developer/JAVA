package Player;

/*
 * Jacob Anderson
 * CIS 280
 * 11-3-2022
 * 
 * BaseballPlayer.java
 * 
 * This program is a class that inherits from player and Overrides the play method to display the 
 * message associated with the class.
 */

public class BaseballPlayer extends Player {
	BaseballPlayer() {

	}
@Override
	public String play() {

		String winConB = "Baseball, where the object of the game is to score the most home runs.\n";
		return winConB;

	}
}
