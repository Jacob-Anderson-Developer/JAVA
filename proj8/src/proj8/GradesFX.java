package proj8;
/* Updated from Grades.java
 * 
 * This updates the Grades.java program to utilize a GUI to input a score, and a try and catch is used to
 * ensure that numerical data is being entered.
 *    
 * Jacob Anderson
 * CIS 280
 * 11-10-2022
 *    
 *    The purpose of this program is to accept user input for the number of credits in a course, 
the name of the course, and then calculate and display the projected hours of study required for the course.   */

/*Jacob Anderson
CIS 280
8-25-2022

GradesFX.java
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
import java.util.Scanner;		//Needed to utilize the Scanner class

public class GradesFX extends Application
{
   // Fields
  private TextField gradeTextField;
  private Label resultLabel;
   
   public static void main(String[] args)
   {
      // Launch the application.
      launch(args);
   }
   
   @Override
   public void start(Stage primaryStage)
   {
	   
      // Create a Label to display a prompt.
      Label promptLabel = new Label("Enter your grade (0-100).");

      
      // Create a TextField for input.
      gradeTextField = new TextField(); 

 
      
      // Create a Button to perform the conversion.
      Button calcButton = new Button("Calculate Study Grades");
      
      // Register the event handler.
      calcButton.setOnAction(new CalcButtonHandler());
      
      // Create an empty Label to display the result.
      resultLabel = new Label();                    
      
      
      Image image = new Image("https://i.etsystatic.com/18602962/r/il/16f15d/1763445900/il_794xN.1763445900_mazp.jpg");
      
	   // Create an ImageView control.
      ImageView imageView = new ImageView(image);
      
      // Put the promptLabel and the kiloTextField in an HBox.
      HBox hbox = new HBox(10, promptLabel);
      
      // Put the HBox, calcButton, and resultLabel in a VBox.
      VBox vbox = new VBox(10, hbox, calcButton, gradeTextField, resultLabel, imageView);
      
      // Set the VBox's alignment to center.
      vbox.setAlignment(Pos.CENTER);
      
      // Set the VBox's padding to 10 pixels.
      vbox.setPadding(new Insets(10));
      
      // Create a Scene.
      Scene scene = new Scene(vbox);

      // Add the Scene to the Stage.
      primaryStage.setScene(scene);
      
      // Set the stage title.
      primaryStage.setTitle("Grade Calculator");
      
      // Show the window.
      primaryStage.show();   
   }

	class CalcButtonHandler implements EventHandler<ActionEvent> {
		boolean scoreError = true;

		@Override
		public void handle(ActionEvent event) {
			try {
				// Get the hours
				int score = Integer.parseInt(gradeTextField.getText());

				// Display the results.
				resultLabel.setText(String.format("Your score has been entered."));

			} catch (NumberFormatException e) {

				resultLabel.setText("Please enter a number only.");
			}
		}
	}
}