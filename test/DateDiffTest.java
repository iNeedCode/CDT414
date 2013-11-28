import static org.junit.Assert.*;

import java.text.ParseException;

import org.junit.Test;


public class DateDiffTest {

// http://www.timeanddate.com/date/duration.html
	
	
	@Test
	public void testDay() throws ParseException {
		DateDiff df = new DateDiff();
		int dd = 0;
		dd = df.getDateDifference("10/08/2013", "21/08/2013");
		assertEquals(11, dd);
	}
	
	@Test
	public void testMonth() throws ParseException {
		DateDiff df = new DateDiff();
		int dd = 0;
		dd = df.getDateDifference("27/06/2009", "14/09/2009");
		assertEquals(79, dd);
	}
	
	@Test
	public void testYear() throws ParseException {
		DateDiff df = new DateDiff();
		int dd = 0;
		dd = df.getDateDifference("27/06/2009", "18/09/2012");
		assertEquals(1179, dd);
	}
	
	@Test
	public void testDateOneGTDateTwo() throws ParseException {
		DateDiff df = new DateDiff();
		int dd = 0;
		dd = df.getDateDifference("27/06/2013", "18/09/2012");
		assertEquals(0, dd);
	}

	@Test(expected = ParseException.class)
	public void testInvalidDate() throws ParseException {
		DateDiff df = new DateDiff();
		int dd = 0;
		dd = df.getDateDifference("27/062013", "18/09/2012");
	}
}
