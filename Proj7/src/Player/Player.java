package Player;
/*
 * Jacob Anderson
 * CIS 280
 * 11-3-2022
 * 
 * Player.java
 * 
 * This is an abstract class that other classes inherit from.  It includes gets and sets for the player name
 * as well as an abstract method called 'play' that the other classes will utilize.
 */

public abstract class Player {

	private String name;

	public abstract String play();

	public void setPlayerName(String demoName) {
		name = demoName;
	}

	public String getPlayerName() {
		return name;
	}
}