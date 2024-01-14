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

public class stuff1 extends Application {

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

		Label HFNLabel = new Label("First Name.");
		Label HLNLabel = new Label("Last Name.");
		Label HAGLabel = new Label("Age.");
		Label HHLLabel = new Label("Homeland.");
		Label HPRLabel = new Label("Purpose.");
		Label HNTLabel = new Label("Nature.");
		Label HDMLabel = new Label("Demeanor.");
		Label HOCLabel = new Label("Occupation.");

		VBox firstCol = new VBox(HFNLabel, fNameTextField, HLNLabel, lNameTextField, HAGLabel, ageComboBox, HHLLabel,
				homeLandTextField);
		VBox secondCol = new VBox(HPRLabel, purposeTextField, HDMLabel, demeanorTextField, HOCLabel,
				occupationTextField, HNTLabel, natureTextField);

		HBox hbox = new HBox(firstCol, secondCol);

		// Create a Scene.
		Scene scene = new Scene(hbox, 800, 800);

		// Add CSS
		scene.getStylesheets().add("myfx.css");

		// Add the Scene to the Stage.
		primaryStage.setScene(scene);

		// Set the stage title.
		primaryStage.setTitle("Jacob Anderson Character Creator");

		// Show the window.
		primaryStage.show();

	}
}