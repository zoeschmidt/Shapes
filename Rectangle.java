import java.util.ArrayList;

/**
 * @author Zoe Schmidt
 * CS 2420 - Spring 2019
 * Chapter 4 Programming 
 * 2/4/2019
 */

public class Rectangle extends Shape implements stretchable {

	private double length;
	private double width;
	private int x;
	private int y;
	
	//Constructor that takes the input and checks if they're positive and if so then takes that parameter
	public Rectangle(double l, double w, int x, int y) {
		
		if((l >= 0) && (w >=0)) {
			length = l;
			width = w;
		}
		else {
			throw new IllegalArgumentException();
		}
		
		if(x > -1 && y > -1) {
			
			this.x = x;
			this.y = y;
		}
		else {
			throw new IllegalArgumentException();
		}
	}
	
	//Methods from the textbook
	public double area() {
		return length*width;
	}
	
	public double perimeter() {
		return 2*(length*width);
	}
	
	public double getLength() {
		return length;
	}
	
	public double getWidth() {
		return width;
	}
	
	public String toString() {
		return "Rectangle " + getLength() + " by " + getWidth();
	}
	
	//Stretchs the Rectangle by making the length longer
	public double stretch(ArrayList<? extends Shape> a ) {
		
		return length*2;
	}
	
	//Gets the X and Y for the distance method
	public int getX() {
		return x;
	}
	
	public int getY() {
		return y;
	}
}
