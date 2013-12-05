import java.util.*;

import static org.junit.Assert.*;

import org.junit.Test;


public class FizzBuzzTest {

//	@Test
//	public void getFizzBuzzTest() {
//		FizzBuzz fb = new FizzBuzz();
//		List<String> rstl = fb.printFizzBuzzSequence();
//		
//		for(int i = 0; i <= 100; i++) {
//			System.out.print(rstl.get(i));
//		}
//	}
	
	@Test
	public void getAllFizzTest() {
		FizzBuzz fb = new FizzBuzz();
		List<String> rstl = fb.printFizzBuzzSequence();
		System.out.println("-------- Buzz --------");

		for(int i = 1; i <= 100; i++) {
			if(((i % 5) == 0) && !((i % 3) == 0) ){
				assertEquals("Buzz", rstl.get(i-1));
				System.out.println("Array " + i + ": " +rstl.get(i-1) + " ");
			}
			
		}
	}
	
	@Test
	public void getAllBuzzTest() {
		FizzBuzz fb = new FizzBuzz();
		List<String> rstl = fb.printFizzBuzzSequence();
		System.out.println("-------- Fizz --------");

		for(int i = 1; i <= 100; i++) {
			if(((i % 3) == 0) && !((i % 5) == 0) ){
				assertEquals("Fizz", rstl.get(i-1));
				System.out.println("Array " + i + ": " +rstl.get(i-1) + " ");
			}
			
		}
	}
	
	@Test
	public void getAllFizzBuzzTest() {
		FizzBuzz fb = new FizzBuzz();
		List<String> rstl = fb.printFizzBuzzSequence();
		System.out.println("-------- FizzBuzz --------");

		for(int i = 1; i <= 100; i++) {
			if(((i % 3) == 0) && ((i % 5) == 0) ){
				assertEquals("FizzBuzz", rstl.get(i-1));
				System.out.println("Array " + i + ": " +rstl.get(i-1) + " ");
			}
			
		}
	}
	
	@Test
	public void getAllActualNumberTest() {
		FizzBuzz fb = new FizzBuzz();
		List<String> rstl = fb.printFizzBuzzSequence();
		System.out.println("-------- Number --------");

		for(int i = 1; i <= 100; i++) {
			if( !((i % 3) == 0) && !((i % 5) == 0) ){
				assertEquals(Integer.toString(i), rstl.get(i-1));
				System.out.println("Array " + i + ": " +rstl.get(i-1) + " ");
			}
			
		}
	}
	

}
