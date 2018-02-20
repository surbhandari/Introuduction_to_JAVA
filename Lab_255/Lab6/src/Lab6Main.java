

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;

/**
 * Lab6:
 *
 *      (Display three cards)
 *      Write a program that displays three cards randomly selected from
 *      a deck of 52, . The card image files are
 *      named 1.png, 2.png, ..., 52.png and stored in the image/card directory.
 *      All three cards are distinct and selected randomly.
 *      Hint: You can select random cards by storing the numbers 1–52 to an array list,
 *      perform a random shuffle introduced in Section 11.12, and use the first three
 *      numbers in the array list as the file names for the image.
 *
 * Created by Surya Bhandari on 02/14/18.
 */
public class Lab6Main extends Application {

	  @Override // Override the start method in the Application class
	  public void start(Stage primaryStage) {
	    // Create a pane to hold the image views
	    Pane pane = new HBox(10);
	    pane.setPadding(new Insets(5, 5, 5, 5));
	    boolean[] usedCards=new boolean[52];
	    //choose 3 random distinct cards from the deck
	    int count=0;
	    while(count<3) {
	    	int card=1+(int)(Math.random()*52);
	    	if(!usedCards[card]) {
	    		usedCards[card]=true;
	    		//file path may be different for window , mac or linux machine 
	    		//for window we give file path as :
	    		//Image image=new Image("file:///C:\\Users\\Surya.Bhandari\\Downloads\\image\\"+card+".png");
	    		//for linux we give file path this way 
	    		Image image = new Image("file:/home/as20510/Downloads/cards/"+card+".png");
	    		pane.getChildren().add(new ImageView(image));
	    		count++;
	    	}
	    }
	    // Create a scene and place it in the stage
	    Scene scene = new Scene(pane);
	    primaryStage.setTitle("ShowImage"); // Set the stage title
	    primaryStage.setScene(scene); // Place the scene in the stage
	    primaryStage.show(); // Display the stage
	  }
	  
	  /**
	   * The main method is only needed for the IDE with limited
	   * JavaFX support. Not needed for running from the command line.
	   */
	  public static void main(String[] args) {
	    launch(args);
	  }
	}

