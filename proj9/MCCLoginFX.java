package proj9;


/*
 * Jacob Anderson
 * CIS 280
 * 11-10-2022
 * 
 * MCCLoginFX.java
 * 
 * The purpose of this program is to create a username and password generator in a GUI using JavaFX.
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

public class MCCLoginFX extends Application {

	private TextField fNameTextField, lNameTextField, stuNoTextField;
	private Label userLabel, passLabel;

	public static void main(String[] args) {
		// Launch the application.
		launch(args);
	}

	@Override
	public void start(Stage primaryStage) {

		// Create a Label to display a prompt.
		Label fNameLabel = new Label("What is your first name?");
		Label lNameLabel = new Label("What is your last name?");
		Label stuNoLabel = new Label("What is your student number?");
		Label userName = new Label("Your User Name:");
		Label password = new Label("Your Password:");

		// Create a TextField for input.
		fNameTextField = new TextField();
		lNameTextField = new TextField();
		stuNoTextField = new TextField();

		// Create a Button to perform the conversion.
		Button CreateButton = new Button("Submit Information");

		// Register the event handler.
		CreateButton.setOnAction(new CreateButtonHandler());

		// Create an empty Label to display the result.
		userLabel = new Label();
		passLabel = new Label();

		Image image = new Image(
				"https://fed.muskegoncc.edu/adfs/portal/logo/logo.png?id=27B4B103C26BAD6198C9D6853312555A4A350334F7199F066CE31AE61AEBB89A");

		// Create an ImageView control.
		ImageView imageView = new ImageView(image);

		// Put the promptLabel and the kiloTextField in an HBox.
		HBox hbox = new HBox(10, fNameLabel, fNameTextField, lNameLabel, lNameTextField, stuNoLabel, stuNoTextField);

		// Put the HBox, calcButton, and resultLabel in a VBox.
		VBox vbox = new VBox(10, hbox, CreateButton, userName, userLabel, password, passLabel, imageView);

		// Set the VBox's alignment to center.
		vbox.setAlignment(Pos.CENTER);

		// Set the VBox's padding to 10 pixels.
		vbox.setPadding(new Insets(10));

		// Create a Scene.
		Scene scene = new Scene(vbox);

		// Add CSS
		scene.getStylesheets().add("login.css");

		// Add the Scene to the Stage.
		primaryStage.setScene(scene);

		// Set the stage title.
		primaryStage.setTitle("Jacob Anderson Study Hour Calculator");

		// Show the window.
		primaryStage.show();

	}

	class CreateButtonHandler implements EventHandler<ActionEvent> {

		@Override
		public void handle(ActionEvent event) {

			String rawFirst = fNameTextField.getText();
			String rawLast = lNameTextField.getText();
			String rawNo = stuNoTextField.getText();

			////////////////////////////// Trims raw input of blanks

			String fName = rawFirst.trim();
			String lName = rawLast.trim();
			String stuNo = rawNo.trim();

			////////////////////////////// Create new StringBuilder objects

			StringBuilder userName = new StringBuilder();
			StringBuilder password = new StringBuilder();
			// StringBuilder message = new StringBuilder();

			////////////////////////////// Create User Name

			userName.append(fName.toLowerCase());
			userName.append(".");
			userName.append(lName.toLowerCase());

			////////////////////////////// Create Password

			password.append(fName.substring(0, 1).toLowerCase());
			password.append(lName.substring(0, 1).toLowerCase());
			password.append(stuNo);
			password.append("!");

			userLabel.setText(userName.toString());
			passLabel.setText(password.toString());

		}
	}
}
