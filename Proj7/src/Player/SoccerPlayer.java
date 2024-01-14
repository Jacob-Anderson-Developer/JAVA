package Player;

/*
 * Jacob Anderson
 * CIS 280
 * 11-3-2022
 * 
 * SoccerPlayer.java
 * 
 * This program is a class that inherits from player and Overrides the play method to display the 
 * message associated with the class.
 */

public class SoccerPlayer extends Player {

	SoccerPlayer() {

	}
@Override
	public String play() {

		String winConS = "Soccer, where the object of the game is to score the most goals.\n";
		return winConS;

	}
}
