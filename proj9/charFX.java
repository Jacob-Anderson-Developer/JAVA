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

public class charFX extends Application {

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

		// Create Radio buttons
		RadioButton male = new RadioButton("Male");
		RadioButton female = new RadioButton("Female");
		
		// Create a Toggle Group
		ToggleGroup radioGroup = new ToggleGroup();
		
		// Add Radio Buttons to Toggle Group
		male.setToggleGroup(radioGroup);
		female.setToggleGroup(radioGroup);
		
		// Create ComboBox
		ComboBox<String> prefixComboBox = new ComboBox<>();
		ComboBox<String> alignmentComboBox = new ComboBox<>();
		ComboBox<String> ageComboBox = new ComboBox<>();
		
		// Add strings to combo box
		prefixComboBox.getItems().addAll("King", "Queen", "Lord", "Lady", "Ms.", "Mrs.", "Mr.", "Dr.", "Baron",
				"Baroness");
		alignmentComboBox.getItems().addAll("Good", "Evil", "Neutral");
		ageComboBox.getItems().addAll("1", "2", "3", "4", "5", "6", "7");
		
		// Create a Button to perform the conversion.
		Button CreateButton = new Button("Display Information");
		Button setButton = new Button("Set Resource");
		
		// Register the event handler.
		// CreateButton.setOnAction(new ButtonHandler());
		
		// ListView creation
		ListView<String> resourceListView = new ListView<>();
		resourceListView.getItems().addAll("Wealth", "Status", "Influence", "Other");
		
		// Create a Listview for age
		ListView<String> ageListView = new ListView<>();
		ageListView.getItems().addAll();
		
		// Images for radio buttons
		
		Image maleImg = new Image("file:male.jpg");
		Image femaleImg = new Image("file:female.jpg");
		
		// Create an ImageView control.
		ImageView imageView = new ImageView(maleImg);
		// Create Labels
		Label FNLabel = new Label("Generate one for me.");
		Label LNLabel = new Label("Generate one for me.");
		Label AGLabel = new Label("Generate one for me.");
		Label HLLabel = new Label("Generate one for me.");
		Label PRLabel = new Label("Generate one for me.");
		Label NTLabel = new Label("Generate one for me.");
		Label DMLabel = new Label("Generate one for me.");
		Label OCLabel = new Label("Generate one for me.");
		
		// Blank Labels created for visual alignment
		Label BlankLabel1 = new Label("");
		Label BlankLabel2 = new Label("");
		Label BlankLabel3 = new Label("");
		Label BlankLabel4 = new Label("");
		Label BlankLabel5 = new Label("");
		Label BlankLabel6 = new Label("");
		Label BlankLabel7 = new Label("");
		Label BlankLabel8 = new Label("");
		Label BlankLabel9 = new Label("");
		Label BlankLabel10 = new Label("");
		Label BlankLabel11 = new Label("");
		Label BlankLabel12 = new Label("");
		Label BlankLabel13 = new Label("");
		Label BlankLabel14 = new Label("");
		Label BlankLabel15 = new Label("");
		Label BlankLabel16 = new Label("");
		
		// Labels to go above text fields
		Label HFNLabel = new Label("First Name.");
		Label HLNLabel = new Label("Last Name.");
		Label HAGLabel = new Label("Age.");
		Label HHLLabel = new Label("Homeland.");
		Label HPRLabel = new Label("Purpose.");
		Label HNTLabel = new Label("Nature.");
		Label HDMLabel = new Label("Demeanor.");
		Label HOCLabel = new Label("Occupation.");
		Label prefixLabel = new Label("Title");
		Label alignmentLabel = new Label("Alignment");
		
		
		
		// Label to display and store results
		resultLabel = new Label("Results will be displayed here.");
		Label recLabel = new Label("Your chosen resource is");
		selectedLabel = new Label("");

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


		
		// Put each attribute in a VBox with its label
		VBox fName = new VBox(HFNLabel, fNameTextField);
		VBox lName = new VBox(HLNLabel, lNameTextField);
		VBox age = new VBox(HAGLabel, ageComboBox);
		VBox purpose = new VBox(HPRLabel, purposeTextField);
		VBox demeanor = new VBox(HDMLabel, demeanorTextField);
		VBox nature = new VBox(HNTLabel, natureTextField);
		VBox occupation = new VBox(HOCLabel, occupationTextField);
		VBox homeland = new VBox(HHLLabel, homeLandTextField);
		
		// Insert a blank label above the label for the textfield to align
		VBox sl1 = new VBox(BlankLabel1, FNLabel);
		VBox sl2 = new VBox(BlankLabel2, LNLabel);
		VBox sl3 = new VBox(BlankLabel3, AGLabel);
		VBox sl4 = new VBox(BlankLabel4, HLLabel);
		VBox sl5 = new VBox(BlankLabel5, PRLabel);
		VBox sl6 = new VBox(BlankLabel6, NTLabel);
		VBox sl7 = new VBox(BlankLabel7, DMLabel);
		VBox sl8 = new VBox(BlankLabel8, OCLabel);
		
		// Insert a blank label above the label for the textfield to align
		VBox dl1 = new VBox(BlankLabel9, checkboxFN);
		VBox dl2 = new VBox(BlankLabel10, checkboxLN);
		VBox dl3 = new VBox(BlankLabel11, checkboxAge);
		VBox dl4 = new VBox(BlankLabel12, checkboxHL);
		VBox dl5 = new VBox(BlankLabel13, checkboxPR);
		VBox dl6 = new VBox(BlankLabel14, checkboxNT);
		VBox dl7 = new VBox(BlankLabel15, checkboxDM);
		VBox dl8 = new VBox(BlankLabel16, checkboxOC);
		
		// Pair Textfields and checkboxes

		HBox FN = new HBox(10, dl1, sl1, fName);
		HBox LN = new HBox(10, dl2,sl2, lName);
		HBox AG = new HBox(10, dl3, sl3, age);
		HBox HL = new HBox(10, dl4, sl4, homeland);
		HBox PR = new HBox(10, dl5, sl5, purpose);
		HBox NT = new HBox(10, dl6, sl6, nature);
		HBox DM = new HBox(10, dl7, sl7, demeanor);
		HBox OC = new HBox(10, dl8, sl8, occupation);

		// Create textfield and checkbox columns
		VBox col1 = new VBox(30, FN, LN, AG, HL);
		VBox col2 = new VBox(30, PR, NT, DM, OC);

		// Put both columns in an Hbox
		HBox body = new HBox(30, col1, col2);
		
		VBox vbox1 = new VBox(prefixLabel, prefixComboBox, alignmentLabel, alignmentComboBox);
		
		// Put the buttons and imageView in an HBox.
		HBox hbox = new HBox(30, male, female, imageView, vbox1);
		
		// Put labels into an HBox.
		HBox hbox2 = new HBox(10, selectedLabel);
		// 
		HBox header = new HBox(30, hbox, hbox2);

		// Set the HBox's alignment to center.
		body.setAlignment(Pos.CENTER);
		
		header.setAlignment(Pos.CENTER);

		// Put the HBox, Button, and resultLabel in a VBox.
		VBox vbox = new VBox(header, body);

		// Set the VBox's alignment to center.
		vbox.setAlignment(Pos.CENTER);
		
		
		// Set HBox 1 and 2 alignment to center.
		hbox.setAlignment(Pos.CENTER);
		hbox2.setAlignment(Pos.CENTER);

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

		// Event Handlers
		male.setOnAction(event -> {
			imageView.setImage(maleImg);
			gender = "Male";
		});

		female.setOnAction(event -> {
			imageView.setImage(femaleImg);
			gender = "Female";
		});

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