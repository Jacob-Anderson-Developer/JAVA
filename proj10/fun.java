package proj10;






import javafx.application.Application;
import java.io.File;
import java.io.IOException;
import java.util.Scanner;
import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;
import javax.sound.sampled.LineUnavailableException;
import javax.sound.sampled.UnsupportedAudioFileException;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.control.Label;
import javafx.scene.control.ListView;
import javafx.scene.control.RadioButton;
import javafx.scene.control.SelectionMode;
import javafx.scene.control.TextField;
import javafx.scene.control.ToggleGroup;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;


public class fun extends Application {

	private TextField nameTextField;
	private ComboBox<String> prefixComboBox, alignmentComboBox;
	private Label resultLabel, selectedLabel, resultLabel2;
	private String response, prefix, alignment, name;
	private ListView<String> resourceListView;

	public static void main(String[] args) {
		// Launch the application.
		launch(args);
	}

	@Override
	public void start(Stage primaryStage) throws Exception {

		// Create a Label to display a prompt.
		Label welcome = new Label("Let's Have Fun!");
		Label nameLabel = new Label("Enter your name.");
		Label responseLabel = new Label("What is your response?");
		Label alignmentLabel = new Label("What is your alignment?");
		Label prefixLabel = new Label("What is your desired prefix?");
		Label resourceLabel = new Label("What resource does your character possess?");
		resultLabel = new Label("Response will be displayed here.");
		resultLabel2 = new Label("Your Name And Title Will Be Displayed Here");
		Label recLabel = new Label("Your chosen resource is");
		selectedLabel = new Label("");
		// Create a TextField for input.
		nameTextField = new TextField();


		// Create Radio buttons
		RadioButton male = new RadioButton("Click here if you response JAVA.");
		RadioButton female = new RadioButton("Click here if you would rather not say.");
		
		// Create a Toggle Group
		ToggleGroup radioGroup = new ToggleGroup();
		
		
		// Add Radio Buttons to Toggle Group
		male.setToggleGroup(radioGroup);
		female.setToggleGroup(radioGroup);
		
		// Create ComboBox
		ComboBox<String> prefixComboBox = new ComboBox<>();
		ComboBox<String> alignmentComboBox = new ComboBox<>();
		
		// Add strings to combo box
		prefixComboBox.getItems().addAll("King", "Queen", "Lord", "Lady", "Ms.", "Mrs.", "Mr.", "Dr.", "Baron", "Baroness" );
		alignmentComboBox.getItems().addAll("Good", "Evil", "Neutral");
		
		// Create a Button to perform the conversion.
		Button CreateButton = new Button("Display Information");
		Button setButton = new Button("Set Resource");

		// Register the event handler.
		CreateButton.setOnAction(new ButtonHandler());

		// ListView creation
		ListView<String> resourceListView = new ListView<>();
		//resourceListView.getSelectionModel().setSelectionMode();
		resourceListView.getItems().addAll("Wealth", "Status", "Influence", "Other");
		
		//
		
		Image maleImg = new Image("file:male.jpg");
		Image femaleImg = new Image("file:female.jpg");

		// Create an ImageView control.
		ImageView imageView = new ImageView(maleImg);

		// Put the promptLabel and the kiloTextField in an HBox.
		HBox hbox = new HBox(10, male, female, imageView);
		HBox hbox2 = new HBox (10, recLabel, selectedLabel);
		// Set the HBox's alignment to center.
		hbox.setAlignment(Pos.CENTER);
		hbox2.setAlignment(Pos.CENTER);
		// Put the HBox, calcButton, and resultLabel in a VBox.
		VBox vbox = new VBox(10, welcome, hbox, prefixComboBox, nameLabel, nameTextField, CreateButton, resultLabel, resultLabel2);

		// Set the VBox's alignment to center.
		vbox.setAlignment(Pos.CENTER);

		// Set the VBox's padding to 10 pixels.
		vbox.setPadding(new Insets(10));

		// Create a Scene.
		Scene scene = new Scene(vbox, 600, 600);

		// Add CSS
		scene.getStylesheets().add("myfx.css");

		// Add the Scene to the Stage.
		primaryStage.setScene(scene);

		// Set the stage title.
		primaryStage.setTitle("Jacob Anderson Character Creator");

		// Show the window.
		primaryStage.show();
		
		male.setOnAction(event ->
		{
			imageView.setImage(maleImg);
			response = "Great! I response JAVA too!";
			resultLabel.setText(response);
		});
		
		female.setOnAction(event ->
		{
			imageView.setImage(femaleImg);
			response = "I can understand wanting to keep it to yourself.";
			resultLabel.setText(response);
		});
		
		prefixComboBox.setOnAction(event ->
		{
			prefix = (String) prefixComboBox.getValue();
		});
		
		alignmentComboBox.setOnAction(event ->
		{
			alignment = (String) alignmentComboBox.getValue();
		});
		
		setButton.setOnAction(event ->
		{
			String selected = resourceListView.getSelectionModel().getSelectedItem();
			selectedLabel.setText(selected);
		});

	}
	

	class ButtonHandler implements EventHandler<ActionEvent> {

		@Override
		public void handle(ActionEvent event) {

			try {
				name = nameTextField.getText();
				
				StringBuilder output = new StringBuilder();
				
				//System.out.println(selected);
				
				output.append("Your name is ");
				output.append(prefix);
				output.append(" ");
				output.append(name);
				output.append(". ");

			

				resultLabel2.setText(output.toString());

			} catch (NullPointerException e) {
				resultLabel2.setText("An error has occurred");
			}
		}

	}
}