package Player;

/*
 * Jacob Anderson
 * CIS 280
 * 11-3-2022
 * 
 * DemoPlayers.java
 * 
 * This is the driver program for the player classes.  It will take user input and assign the information to
 * a player, then display the information about that player.
 */
import java.util.Scanner; 

public class DemoPlayers {
	public static void main(String[] args) {
		String demoName;
		
		// Welcome User
		
		System.out.println("Welcome to the Jacob Anderson Player Creator!\n");

		// Create Players
		MonopolyPlayer MonPlayer = new MonopolyPlayer();
		SoccerPlayer SocPlayer = new SoccerPlayer();
		BaseballPlayer BallPlayer = new BaseballPlayer();

		// Create Scanner Object that will allow input from keyboard.
		Scanner keyboard = new Scanner(System.in);

		// Prompt User for player name
		System.out.println("What is the name of the Monopoly player?");
		demoName = keyboard.nextLine();

		// Sets Player Name
		MonPlayer.setPlayerName(demoName);

		// Gets Player Name and Sport
		System.out.println("Hi! My name is " + MonPlayer.getPlayerName() + ", and my game is " + MonPlayer.play());

		// Prompt User for player name
		System.out.println("What is the name of the Soccer player?");
		demoName = keyboard.nextLine();

		// Sets Player Name
		SocPlayer.setPlayerName(demoName);

		// Gets Player Name and Sport
		System.out.println("Hi! My name is " + SocPlayer.getPlayerName() + ", and my game is " + SocPlayer.play());

		// Prompt User for player name
		System.out.println("What is the name of the Baseball player?");
		demoName = keyboard.nextLine();

		// Sets Player Name
		BallPlayer.setPlayerName(demoName);

		// Gets Player Name and Sport
		System.out.println("Hi! My name is " + BallPlayer.getPlayerName() + ", and my game is " + BallPlayer.play());
		
		// Close Keyboard
		keyboard.close();
	}
}