import static org.junit.Assert.*;

import org.junit.Test;


public class PersonTest {
	
	@Test
	public void testPerson() {
		Person p1 = new Person();
		assertEquals("unknown name", p1.getName());
		assertEquals(3, p1.getMaximumBooks());
	}

	@Test
	public void testSetName() {
		Person p2 = new Person();
		p2.setName("Fred");
		assertEquals("Fred", p2.getName());
		
	}

	@Test
	public void testSetMaximumbooks() {
		Person p3 = new Person();
		p3.setMaximumBooks(10);
		assertEquals(10, p3.getMaximumBooks());
	}

	@Test
	public void testtoString(){
		Person p4 = new Person();
		p4.setName("Fred Froddo");
		p4.setMaximumBooks(9);
		String testString = "Fred Froddo (9 Books)";
		assertEquals(testString, p4.toString());
	}
}
