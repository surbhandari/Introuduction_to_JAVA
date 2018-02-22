/*********************************************************************************
* (Create four fans) Write a program that places four fans in a GridPane with    *
* two rows and two columns, as shown in Figure                            *
*********************************************************************************/
import javafx.application.Application;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.StackPane;
import javafx.scene.layout.Pane;
import javafx.scene.shape.Circle;
import javafx.scene.shape.Arc;
import javafx.scene.shape.ArcType;
import javafx.scene.paint.Color;
import javafx.geometry.Insets;

public class EnclosedFigure extends Application {
	@Override // Override the start method in the Application class
	
	public void start(Stage primaryStage) {
		
		// Create a GridPane and set its properties
		GridPane gridPane = new GridPane();
		gridPane.setPadding(new Insets(10, 10, 10, 10));
		gridPane.setHgap(10);
		gridPane.setVgap(10);

	
				// Create a stack pane
				StackPane stackPane1 = new StackPane();
				StackPane stackPane2 = new StackPane();
				StackPane stackPane3 = new StackPane();
				StackPane stackPane4 = new StackPane();

				//create 4 cirlce 
				Circle circle1 = getCircle();
				Circle circle2 = getCircle();
				Circle circle3 = getCircle();
				Circle circle4 = getCircle();
				
				// Add circle to stack pane
				stackPane1.getChildren().add(circle1);
				stackPane2.getChildren().add(circle2);
				stackPane3.getChildren().add(circle3);
				stackPane4.getChildren().add(circle4);
				

				// Add Arcs to stack pane
				getArcs2C(stackPane1);
				getArcs1C(stackPane2);
				getArcs1C(stackPane3);
				getArcs2C(stackPane4);

				gridPane.add(stackPane1, 0, 0);
				gridPane.add(stackPane2, 0, 1);
				gridPane.add(stackPane3, 1, 0);
				gridPane.add(stackPane4, 1, 1);
				
		
		
		// Create a scene and place in in the stage
		Scene scene = new Scene(gridPane);
		primaryStage.setTitle("Lab 07"); // Set the stage title
		primaryStage.setScene(scene); // Place the scene in the stage
		primaryStage.show(); // Display the stage
	}

	/** Add four arcs to a pane and place them in a stack pane */
	private void getArcs2C(StackPane stackPane) {
		for (int i = 0; i < 360; i+=120) {
			Pane pane = new Pane();
			Arc arc1 = new Arc(100, 100, 95, 95, i, 30);
			arc1.setFill(Color.RED);
			arc1.setType(ArcType.ROUND);
			//pane.getChildren().add(arc1);
			
			Arc arc2 = new Arc(100, 100, 95, 95, i+60, 30);
			arc2.setFill(Color.BLUE);
			arc2.setType(ArcType.ROUND);
			pane.getChildren().addAll(arc1,arc2);
			stackPane.getChildren().add(pane);
			
		}
	}
	private void getArcs1C(StackPane stackPane) {
		for (int i = 0; i < 360; i+=40) {
			Pane pane = new Pane();
			Arc arc1 = new Arc(100, 100, 95, 95, i, 20);
			arc1.setFill(Color.RED);
			arc1.setType(ArcType.ROUND);
			pane.getChildren().add(arc1);
			stackPane.getChildren().add(pane);
		}
	}

	/** Return a Circle */
	private Circle getCircle() {
		Circle c = new Circle();
		c.setRadius(100);
		c.setStroke(Color.BLACK);
		c.setFill(Color.WHITE);
		return c;
	}
}