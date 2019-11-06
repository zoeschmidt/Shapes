import java.util.ArrayList;

/**
 * @author Zoe Schmidt
 * CS 2420 - Spring 2019
 * Chapter 4 Programming
 * 2/4/2019
 */

public class Square extends Rectangle implements stretchable {

	private double side;
	private int x;
	private int y;
	
	//Constructor that takes the input and checks if they're positive and if so then takes that parameter
	public Square(double side, int x, int y) {
		super(side, side, x, y);
		
		if(side >= 0) {
			this.side = side;
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
		return side*side;
	}
	
	public double perimeter() {
		return 4*side;
	}
	
	public double getSide() {
		return side;
	}
	
	public String toString() {
		return "Square " + getSide() + " by " + getSide();
	}
	
	//Stretchs the Square by making the side longer
	public double stretch(ArrayList<? extends Shape> a ) {
		
		return side*2;
	}
	
	//Gets the X and Y for the distance method
	public int getX() {
		return x;
	}
	
	public int getY() {
		return y;
	}
}
