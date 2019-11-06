/**
 * @author Zoe Schmidt
 * CS 2420 - Spring 2019
 * Chapter 4 Programming 
 * 2/4/2019
 */

import java.util.*;

public class Circle extends Shape implements Comparable<Circle>, stretchable {

	private double radius;
	private int x;
	private int y;
	
	//Circle constructor that takes the input and checks if they're positive and if so then takes that parameter
	public Circle(double rad, int x, int y) {
		
		if(rad >= 0) {
			radius = rad;
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
		
		return Math.PI*radius*radius;
	}
	
	public double perimeter() {
		return 2*Math.PI*radius;
	}
	
	public String toString() {
		return "Circle: " + radius;
	}

	//Get radius method for the compareTo method
	public double getRadius() {
		return radius;
	}
	
	//Compares the current circle to the parameter circle
	@Override
	public int compareTo(Circle c) {
		if(this.radius > c.getRadius()) {
			return 1;
		}
		else if(this.radius < c.getRadius()){
			return -1;
		}
		else {
			return 0;
		}
	}
	
	//Stretchs the Circle by making the radius bigger
	public double stretch(ArrayList<? extends Shape> a ) {
			return radius*2;
	}
	
	//Gets the X and Y for the distance method
	public int getX() {
		return x;
	}
	
	public int getY() {
		return y;
	}
	
}
