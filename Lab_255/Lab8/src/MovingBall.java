
import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.Pane;
import javafx.scene.shape.Circle;
import javafx.scene.paint.Color;
import javafx.stage.Stage;

public class MovingBall extends Application {

	@Override
	public void start(Stage primaryStage) throws Exception {
		
		BallPane ballPane = new BallPane();
		
		// Hold four buttons in a HBox
		HBox hBox = new HBox();
		hBox.setAlignment(Pos.CENTER);
		Button btU = new Button("Up");
		Button btD = new Button("Down");
		Button btL = new Button("Left");
		Button btR = new Button("Right");
		Button btE = new Button("Enlarge");
		Button btS = new Button("Shrink");
		hBox.getChildren().addAll(btU,btD,btL,btR,btE,btS);
		
		
		// Create and register the handler
        btU.setOnAction(e -> ballPane.moveUp());
        btD.setOnAction(e -> ballPane.moveDown());
        btL.setOnAction(e -> ballPane.moveLeft());
        btR.setOnAction(e -> ballPane.moveRight());
        btE.setOnAction(e -> ballPane.enlarge());
        btS.setOnAction(e -> ballPane.shrink());
        
     // Create a border pane
        BorderPane pane = new BorderPane();
        pane.setPadding(new Insets(0,10,5,10));
        pane.setCenter(ballPane);
        pane.setBottom(hBox);
        
     // Create a scene and place it in the stage
        Scene scene = new Scene(pane, 400, 400);
        primaryStage.setScene(scene);
        primaryStage.setTitle("Moving Ball");
        primaryStage.show();
        
	}
	public static void main(String[] args) {
        Application.launch(args);
    }
	
	
	
	private class BallPane extends Pane{
		
	private Circle circle= new Circle(20,20,20);
	// Construct a default ball pane
		public BallPane() {
			circle.setFill(Color.GREEN);
			circle.setStroke(Color.BLACK);
			getChildren().add(circle); // Place a ball into this pane
		}
	
	
	
	
	public void moveUp() {
		
		if(circle.getCenterY()>circle.getRadius())
			circle.setCenterY(circle.getCenterY()-20);
		else
			circle.setCenterY(circle.getCenterY());
		circle.setCenterX(circle.getCenterX());
		
		
		
    }
	
	public void moveDown() {
		if(circle.getCenterY()<(getHeight()-circle.getRadius()))
			circle.setCenterY(circle.getCenterY()+20);
		else
			circle.setCenterY(circle.getCenterY());
		circle.setCenterX(circle.getCenterX());
		
    }
	public void moveLeft() {
		if(circle.getCenterX()>circle.getRadius())
			circle.setCenterX(circle.getCenterX()-20);
		else
			circle.setCenterX(circle.getCenterX());
		circle.setCenterY(circle.getCenterY());
    }
	public void moveRight() {
		if(circle.getCenterX()<(getWidth()-circle.getRadius()))
			circle.setCenterX(circle.getCenterX()+20);
		else
			circle.setCenterX(circle.getCenterX());
		circle.setCenterY(circle.getCenterY());
    }
	public void enlarge() {
		circle.setRadius(circle.getRadius()+2);
		
	}
	public void shrink() {
		if(circle.getRadius() >2) {
			circle.setRadius(circle.getRadius()-2);
		}
		else
			circle.setRadius(circle.getRadius());
	}

}
}
