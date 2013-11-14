import static org.junit.Assert.*;

import org.junit.Test;


public class TestTriangle {

	@Test
	public void getTypeTest() {
		Triangle triangle = new Triangle();
		assertEquals("return from Triangle::getType", triangle.getType(0, 0, 0));
	} 

}
