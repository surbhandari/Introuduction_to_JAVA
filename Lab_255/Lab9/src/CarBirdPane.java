
import javafx.scene.layout.*;
import javafx.scene.paint.Color;
import javafx.scene.shape.*;
class CarBirdPane extends Pane  {
	//data types of car 
	private double x= 50;
	private double y= 400;
	private double radius= 10;
	private Circle circle1;
	private Circle circle2;
	private Rectangle rectangle;
	private Polygon polygon;
	
	//data types of bird
	private double x1=360, y1=30;
	private Ellipse body ;
	private Ellipse tail;
	private Ellipse beak1;
	private Ellipse beak2;
	private Ellipse eye ;
	private Ellipse pupil;
	private Ellipse eyebrows;
	
	CarBirdPane(){
		drawCar();
		drawBird();	
	}
	
	private void draw() {
		body = new Ellipse(x1,y1,30,20);
		tail=new Ellipse(x1-30,y1,20,7.5);
		getChildren().addAll(body,tail);	
	}
	
	private void drawCar(){
		getChildren().removeAll(polygon,rectangle,circle1,circle2);
		polygon = new Polygon(x+20,y-40,x+40,y-60,x+60,y-60,x+80,y-40);
		polygon.setFill(Color.RED);
		rectangle = new Rectangle(x,y-40,100,20);
		rectangle.setFill(Color.LIGHTGREEN);
		circle1 = new Circle(x+30,y-10,radius);
		circle2 = new Circle(x+70,y-10,radius);
		getChildren().addAll(circle1,circle2,rectangle,polygon);
	}
	
	private void drawBird() {
		getChildren().removeAll(body,tail,beak1,beak2,eye,pupil,eyebrows);
		//body
		body = new Ellipse(x1,y1,30,20);
		body.setFill(Color.GOLD);
		body.setStroke(Color.BLACK);
		//tail
		tail=new Ellipse(x1-30,y1,20,7.5);
		tail.setFill(Color.WHITE);
		tail.setStroke(Color.BLACK);
		tail.setRotate(25);
		//beak
		beak1=new Ellipse(x1+30,y1,10,2);
		beak1.setFill(Color.RED);
		beak1.setStroke(Color.BLACK);
		beak2=new Ellipse(x1+30,y1+4,10,2);
		beak2.setFill(Color.RED);
		beak2.setStroke(Color.BLACK);	
		//eye
		eye = new Ellipse(x1+20,y1-10,10,5);
		eye.setFill(Color.WHITE);
		eye.setStroke(Color.BLACK);
		eye.setRotate(35);
		//pupil
		pupil = new Ellipse(x1+19,y1-9,4,3);
		//eyebrows
		eyebrows = new Ellipse(x1+16,y1-22,15,3);
		eyebrows.setRotate(35);
	
		getChildren().addAll(body,tail,beak1,beak2,eye,pupil,eyebrows);			
	}
	
	void moveBirdUp() {
		if(y1 >= 20){
			y1-=10;
		}
		else
			y1=20;
		drawBird();	
	}
	
	void moveBirdDown() {
		if(y1 <= 390){
			y1+=10;
		}
		else
			y1=390;
		drawBird();
	}
	
	void moveCarLeft(){
		if(x >= 0){
			x-=10;
		}
		else
			x=0;
		drawCar();	
	}
	
	void moveCarRight(){
		if(x <= 320){
			x+=10;
		}
		else
			x=320;
		drawCar();
	}
}