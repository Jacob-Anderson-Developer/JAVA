package Player;

/*
 * Jacob Anderson
 * CIS 280
 * 11-3-2022
 * 
 * MonopolyPlayer.java
 * 
 * This program is a class that inherits from player and Overrides the play method to display the 
 * message associated with the class.
 */
public class MonopolyPlayer extends Player {

	MonopolyPlayer() {

	}
@Override
	public String play() {

		String winConM = "Monopoly, where the object of the game is to become the wealthiest player.\n";
		return winConM;

	}
}