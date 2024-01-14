package proj9;


/*
 * Jacob Anderson
 * 11-23-2022
 * CIS 280
 * 
 * YourFX.java
 * 
 * The purpose of this program is to display an understanding of the controls and event handlers in a GUI.
 * This is my primitive version of a character creator of sorts.  It will allow a user to select a gender
 * a disposition, a title and 1 enhanced resource.  It will then display the results of the selections
 * you have made.
 */
import javafx.application.Application;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.CheckBox;
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
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class test extends Application {

 private TextField fNameTextField, lNameTextField, homeLandTextField, purposeTextField, natureTextField, demeanorTextField, occupationTextField;
 private ComboBox<String> prefixComboBox, alignmentComboBox, ageComboBox;
 private Label resultLabel, selectedLabel;
 private String gender, prefix, alignment, name;
 private ListView<String> resourceListView, ageListView;
 private CheckBox checkboxFN, checkboxLN, checkboxAge, checkboxHL, checkboxPR, checkboxNT, checkboxDM, checkboxOC;

	public static void main(String[] args) {
		// Launch the application.
		launch(args);
	}

	@Override
	public void start(Stage primaryStage) throws Exception {
		
		Label FNLabel = new Label("Generate one for me.");
		Label LNLabel = new Label("Generate one for me.");
		Label AGLabel = new Label("Generate one for me.");
		Label HLLabel = new Label("Generate one for me.");
		Label PRLabel = new Label("Generate one for me.");
		Label NTLabel = new Label("Generate one for me.");
		Label DMLabel = new Label("Generate one for me.");
		Label OCLabel = new Label("Generate one for me.");
		
		Label HFNLabel = new Label("First Name.");
		Label HLNLabel = new Label("Last Name.");
		Label HAGLabel = new Label("Age.");
		Label HHLLabel = new Label("Homeland.");
		Label HPRLabel = new Label("Purpose.");
		Label HNTLabel = new Label("Nature.");
		Label HDMLabel = new Label("Demeanor.");
		Label HOCLabel = new Label("Occupation.");

		// Create a TextField for input.
		fNameTextField = new TextField();
		lNameTextField = new TextField();
		homeLandTextField = new TextField();
		purposeTextField = new TextField();
		natureTextField = new TextField();
		demeanorTextField = new TextField();
		occupationTextField = new TextField();

		// Set Prompt Text
		fNameTextField.setPromptText("Enter your first name.");
		lNameTextField.setPromptText("Enter your last name.");
		homeLandTextField.setPromptText("Enter your Home Land.");
		purposeTextField.setPromptText("Enter your Purpose.");
		natureTextField.setPromptText("Enter your Nature.");
		demeanorTextField.setPromptText("Enter your Demeanor.");
		occupationTextField.setPromptText("Enter your Occupation.");

		// Create Checkboxes
		CheckBox checkboxFN = new CheckBox();
		CheckBox checkboxLN = new CheckBox();
		CheckBox checkboxAge = new CheckBox();
		CheckBox checkboxHL = new CheckBox();
		CheckBox checkboxPR = new CheckBox();
		CheckBox checkboxNT = new CheckBox();
		CheckBox checkboxDM = new CheckBox();
		CheckBox checkboxOC = new CheckBox();

		// Create ComboBox
		ComboBox<String> ageComboBox = new ComboBox<>();

		// Add strings to combo box
		ageComboBox.getItems().addAll("1", "2", "3", "4", "5", "6", "7");

		// Create a Button to perform the conversion.
		Button CreateButton = new Button("Display Information");
		Button setButton = new Button("Set Resource");


		VBox firstCol = new VBox(HFNLabel, fNameTextField, HLNLabel, lNameTextField, HAGLabel, ageComboBox, HHLLabel, homeLandTextField);
		VBox secondCol = new VBox(HPRLabel, purposeTextField, HDMLabel, demeanorTextField, HOCLabel, occupationTextField, HNTLabel, natureTextField);
		
		HBox labelPair = new HBox(firstCol, secondCol);
		
//		// Pair Textfields and checkboxes
//
//		HBox FN = new HBox(10, checkboxFN, FNLabel, fNameTextField);
//		HBox LN = new HBox(10, checkboxLN,LNLabel, lNameTextField);
//		HBox AG = new HBox(10, checkboxAge, AGLabel, ageComboBox);
//		HBox HL = new HBox(10, checkboxHL, HLLabel, homeLandTextField);
//		HBox PR = new HBox(10, checkboxPR, PRLabel, purposeTextField);
//		HBox NT = new HBox(10, checkboxNT, NTLabel, natureTextField);
//		HBox DM = new HBox(10, checkboxDM, DMLabel, demeanorTextField);
//		HBox OC = new HBox(10, checkboxOC, OCLabel, occupationTextField);

//		// Create textfield and checkbox columns
//		VBox col1 = new VBox(30, FN, LN, AG, HL);
//		VBox col2 = new VBox(30, PR, NT, DM, OC);
//
//		// Put both columns in an Hbox
//		HBox all = new HBox(30, col1, col2);

//		// Set the HBox's alignment to center.
//		all.setAlignment(Pos.CENTER);

		// Put the HBox, Button, and resultLabel in a VBox.
		VBox vbox = new VBox(labelPair);

		// Set the VBox's alignment to center.
		vbox.setAlignment(Pos.CENTER);

		// Set the VBox's padding to 10 pixels.
		vbox.setPadding(new Insets(10));

		// Create a Scene.
		Scene scene = new Scene(vbox, 800, 800);

		// Add CSS
		scene.getStylesheets().add("myfx.css");

		// Add the Scene to the Stage.
		primaryStage.setScene(scene);

		// Set the stage title.
		primaryStage.setTitle("Jacob Anderson Character Creator");

		// Show the window.
		primaryStage.show();

//		// Event Handlers
//		male.setOnAction(event -> {
//			imageView.setImage(maleImg);
//			gender = "Male";
//		});
//
//		female.setOnAction(event -> {
//			imageView.setImage(femaleImg);
//			gender = "Female";
//		});

		prefixComboBox.setOnAction(event -> {
			prefix = (String) prefixComboBox.getValue();
		});

		alignmentComboBox.setOnAction(event -> {
			alignment = (String) alignmentComboBox.getValue();
		});

		setButton.setOnAction(event -> {
			String selected = resourceListView.getSelectionModel().getSelectedItem();
			selectedLabel.setText(selected);
		});

	}
}