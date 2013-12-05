import java.util.*;

public class FizzBuzz {
	
	
	public List<String> printFizzBuzzSequence(){
		List<String> list = new ArrayList<String>();
		for(int i = 1; i <= 100; i++) {
			if (((i % 5) == 0) && ((i % 3) == 0)) {
				list.add("FizzBuzz");
			}
			else if ((i % 5) == 0){
				list.add("Buzz");
			}
			else if ((i % 3) == 0){
				list.add("Fizz");
			}
			else {
				list.add(Integer.toString(i));
			}
		}
		return list;
	}
		

}
