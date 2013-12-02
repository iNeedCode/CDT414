import static org.junit.Assert.*;

import org.junit.Test;

public class TestTriangle {

	@Test
	public void getTypeTestEquilateral() {
		Triangle triangle = new Triangle();
		assertEquals("Equilateral", triangle.getType(3, 3, 3));
	}
	
	@Test
	public void getTypeTestIsosceles() {
		Triangle triangle = new Triangle();
		assertEquals("Isosceles", triangle.getType(3, 3, 4));
		assertEquals("Isosceles", triangle.getType(3, 4, 4));
	} 
	
	@Test
	public void getTypeTestScalene() {
		Triangle triangle = new Triangle();
		assertEquals("Scalene", triangle.getType(2, 4, 3));		
	}
	
	@Test
	public void getTypeTestNotValid() {
		Triangle triangle = new Triangle();
		assertEquals("Is not a valid triangle", triangle.getType(2, 2, 4));
		assertEquals("Is not a valid triangle", triangle.getType(1, 2, 3));
	} 
	

}
