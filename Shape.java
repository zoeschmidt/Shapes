import java.util.ArrayList;

/**
 * @author Zoe Schmidt
 * CS 2420 - Spring 2019
 * Chapter 4 Programming 
 * 2/4/2019
 */

public abstract class Shape {

	//Methods from the textbook
	abstract double area();
	
	abstract double perimeter();
	
	abstract double stretch(ArrayList<? extends Shape> a);
	
	//Uses the stretch method in each class and stretches each shape in the array
	public static ArrayList stretchAll(ArrayList<? extends Shape> a ) {
		ArrayList array = new ArrayList();
		
		for(Shape s: a) {
			array.add(s.stretch(a));
			
		}
		return array;
	}
	
	//Takes the x and y coordinates of each shape and finds the distance
	public static double distance(Shape a, Shape b) {
		
		double distance = Math.abs(Math.sqrt(((((Circle) a).getX() - ((Rectangle) b).getX()*(((Circle) a).getX() - ((Rectangle) b).getX())) + (((Circle) a).getY() - ((Rectangle) b).getY())*(((Circle) a).getY() - ((Rectangle) b).getY()))));
		return distance;
	}
	


	public static void main(String[] args) {
		
		//Creates shape a with 5 as the radius and 0,1 as the x and y coordinates
		Shape a = new Circle(5, 0, 1);
		//Creates shape b with 2 as the length and 4 as the width and 0,5 as the x and y coordinates
		Shape b = new Rectangle(2,4,0,5);
	
		//Testing the distance method on shape a and b 
		System.out.println("Distance: " + distance(a, b));
	
		ArrayList<Shape> array = new ArrayList<Shape>();
		array.add(a);
		array.add(b);
		
		//Testing the stretchAll method on array which has shape a and b
		System.out.println("StretchAll: " + stretchAll(array));
		
		
		
	}
	
}
