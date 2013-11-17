import static org.junit.Assert.*;

import org.junit.Test;

public class TestTriangle {

	@Test
	public void getTypeTest1() {
		Triangle triangle = new Triangle();
		assertEquals("Equilateral", triangle.getType(2, 2, 2));
	}
	
	@Test
	public void getTypeTest2() {
		Triangle triangle = new Triangle();
		assertEquals("Isosceles", triangle.getType(2, 2, 4));
		assertEquals("Isosceles", triangle.getType(4, 2, 2));
	} 
	
	@Test
	public void getTypeTest3() {
		Triangle triangle = new Triangle();
		assertEquals("Scalene", triangle.getType(1, 2, 3));
	} 
	

}
