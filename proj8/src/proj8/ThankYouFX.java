package proj8;
/*
 *   The purpose of this program is to display "Thank you" in 4 different languages
 *   Using a series of event handlers   */

/*
 * Jacob Anderson
 * CIS 280
 * 11-5-2022
*/

import javafx.application.Application;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.geometry.Pos;
import javafx.geometry.Insets;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.control.Button;
import javafx.event.EventHandler;
import javafx.event.ActionEvent;
import java.util.Scanner; //Needed to utilize the Scanner class



public class ThankYouFX extends Application {
	
	// Fields
	private Label resultLabel;

	public static void main(String[] args) {
		// Launch the application.
		launch(args);
	}

	@Override
	public void start(Stage primaryStage) {

		// Create a Label to display a prompt.
		Label infoLabel = new Label("Click the language you would like to display 'Thank You'.");

		// Create a Button to perform the conversion.
		Button frenchButton = new Button("Translate to French");
		Button spanishButton = new Button("Translate to Spanish");
		Button italianButton = new Button("Translate to Italian");
		Button englishButton = new Button("Translate to English");

		// Register the event handler.
		frenchButton.setOnAction(new FrenchButtonHandler());
		spanishButton.setOnAction(new SpanishButtonHandler());
		italianButton.setOnAction(new ItalianButtonHandler());
		englishButton.setOnAction(new EnglishButtonHandler());

		// Create an empty Label to display the result.
		resultLabel = new Label();
		
		resultLabel.setText(String.format("Thank you (English)"));

		// Put the promptLabel and the kiloTextField in an HBox.
		HBox hbox = new HBox(10);

		// Put the HBox, calcButton, and resultLabel in a VBox.
		VBox vbox = new VBox(10, hbox, infoLabel, frenchButton,  spanishButton, italianButton, englishButton, resultLabel);

		// Set the VBox's alignment to center.
		vbox.setAlignment(Pos.CENTER);

		// Set the VBox's padding to 10 pixels.
		vbox.setPadding(new Insets(10));

		// Create a Scene.
		Scene scene = new Scene(vbox);

		// Add the Scene to the Stage.
		primaryStage.setScene(scene);

		// Set the stage title.
		primaryStage.setTitle("Thank you translator");

		// Show the window.
		primaryStage.show();
	}

	class FrenchButtonHandler implements EventHandler<ActionEvent> {

		@Override
		public void handle(ActionEvent event) {

			// Display the results.
			resultLabel.setText(String.format("Merci."));

		}
	}

	class SpanishButtonHandler implements EventHandler<ActionEvent> {

		@Override
		public void handle(ActionEvent event) {

			// Display the results.
			resultLabel.setText(String.format("Gracias."));
		}
	}

	class ItalianButtonHandler implements EventHandler<ActionEvent> {

		@Override
		public void handle(ActionEvent event) {

			// Display the results.
			resultLabel.setText(String.format("Grazie."));
		}
	}
	
	class EnglishButtonHandler implements EventHandler<ActionEvent> {

		@Override
		public void handle(ActionEvent event) {

			// Display the results.
			resultLabel.setText(String.format("Thank you."));
		}
	}
}
