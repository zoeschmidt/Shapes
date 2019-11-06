/**
 * @author Zoe Schmidt
 * CS 2420 - Spring 2019
 * Chapter 4 Programming
 * 2/4/2019
 */
import java.util.*;

//Interface that the stretch methods in each shape use
public interface stretchable {
	
	double stretch(ArrayList<? extends Shape> a);
	

}
