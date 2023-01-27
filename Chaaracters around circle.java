/*
 * Name: Adnaan Chida 
 * Purpose: JavaFX and characters around in a circle. with words "WELCOME TO JAVA"
 */

//import packages
import javafx.application.Application;
import javafx.geometry.Point2D;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;
import javafx.scene.text.Font;
import javafx.scene.text.FontWeight;
import javafx.scene.text.Text;
import javafx.stage.Stage;

//Define the class.
public class Lab extends Application
{
@Override
public void start(Stage primaryStage) 
{
//Create a new pane.
Pane pane = new Pane();
//Define the string.
String[] cirText = "WELCOME TO JAVA".split("");
//Create an object of Font class and 
//define font features 

Font font = Font.font("Times New Roman", FontWeight.BOLD, 35);
//Create an object of point2D.
Point2D center = new Point2D(200, 200);

//Define the variables.
double rad = 100;
double angle = 0;
double rot = 90;

//Start the for loop.

for (int i = 0; i < cirText.length; i++, angle += 22, rot += 22) 
{
double x = center.getX() + 
rad * Math.cos(Math.toRadians(angle));
double y = center.getY() +
rad * Math.sin(Math.toRadians(angle));

//create an instance of Text on the given
//coordinates containing the given characters
Text text = new Text(x, y,cirText[i]);

//Define characters and their rotated positions
text.setRotate(rot);
text.setFont(font);

//Add text instance to the pane.
pane.getChildren().add(text);
}

//Create a scene.
Scene scene = new Scene(pane, 400, 400);

//Set title to "Characters around circle"
primaryStage.setTitle("Characters around circle");
primaryStage.setScene(scene);

//Display the stage.
primaryStage.show();

}

//Define the main method.
public static void main(String[] args) {
//Launch the app.
Application.launch(args);
}
}