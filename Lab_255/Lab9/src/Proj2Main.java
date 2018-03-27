/*Write a Java program that simulates car racing and bird flapping,
 *  as shown in the figures. The car moves from left to right by 
 *  pressing RIGHT key and from right to left by pressing LEFT key. 
 *  Similarly, the bird moves up by pressing the UP key and move down 
 *  by pressing the DOWN key.
*/


import javafx.event.*;
import javafx.application.Application;
import javafx.geometry.Pos;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.layout.HBox;
import javafx.scene.layout.StackPane;
import javafx.scene.control.Button;
import javafx.scene.input.KeyCode;
import javafx.scene.input.KeyEvent;
public class Proj2Main extends Application {
	public void start(Stage primaryStage) {
	
	CarBirdPane pane = new CarBirdPane();
	pane.setOnKeyPressed(e -> {
		switch(e.getCode()) {
		case DOWN: pane.moveBirdDown();break;
		case UP:pane.moveBirdUp(); break;
		case LEFT:pane.moveCarLeft();break;
		case RIGHT: pane.moveCarRight();break;
		}
	});
	Scene scene = new Scene(pane,400,400);
	primaryStage.setScene(scene);
	primaryStage.show();
	pane.requestFocus();
	primaryStage.setResizable(false);
	}
	
	//main method 
	public static void main(String[] args){
		Application.launch(args);
	}
}