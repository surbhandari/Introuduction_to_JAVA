import javafx.application.Application;
import javafx.stage.Stage;
import javafx.scene.*;
import javafx.scene.shape.*;
import javafx.scene.layout.*;
import javafx.scene.paint.Color;



public class test extends Application{
	private static final int radius = 100;
    private static final int gap = 10;
	public void start(Stage primaryStage) {
		Pane pane = new Pane();
		
		int x = radius+gap;
		int y = radius+gap;
							
		Circle c = new Circle(radius);
		c.setCenterX(x);
		c.setCenterY(y);
		c.setStroke(Color.RED);
		c.setFill(Color.WHITE);
		pane.getChildren().add(c);
		
		for(int j=0;j<360;j+=120) {
			
			Arc arc = new Arc(x, y, radius-5,radius-5,j,30);
            arc.setFill(Color.RED);
            arc.setType(ArcType.ROUND);
			
			Arc arc1 = new Arc(x,y,radius-5,radius-5,j+60,30);
			arc1.setFill(Color.BLUE);
			arc1.setType(ArcType.ROUND);
			//pane.getChildren().addAll(arc,arc1);
			
		}
		
		//x+=radius*2+gap;
		
		Circle c1 = new Circle(radius);
		c.setCenterX(x+radius*2+gap);
		c1.setCenterY(y);
		c1.setStroke(Color.BLACK);
		c1.setFill(Color.WHITE);
		//pane.getChildren().add(c1);
		
		
		//creating 9 arc in the circle 
		for(int i =0;i<360;i+=40) {
		Arc arc2 = new Arc(x,y,radius-5,radius-5,i,20);
		arc2.setFill(Color.RED);
		arc2.setType(ArcType.ROUND);
		
		pane.getChildren().add(arc2);
		}
		
		
		
		//pane.getChildren().addAll(arc,arc1);
		
		Scene scene= new Scene(pane,440,440);
		primaryStage.setScene(scene);
		primaryStage.setTitle("Lab7_255");
		primaryStage.show();
		
	}
	
	
	public static void main(String[] args) {
		Application.launch(args);
	}
	
}