import java.text.ParseException;


public class Triangle {
	
	public static void main(String[] args) throws ParseException {
		System.out.println("main file was called");
		

	}
	
	public String getType(int i, int j, int k)
	{
		if (i == j && j == k) {
			return "Equilateral";
		} 
		else if (i == j || j == k) {
			return "Isosceles";
		}
		else if (i != j && i != k && j != k) {
			return "Scalene";
		}
		else {
			return "A not defined Triangle";
		}
	}
}
