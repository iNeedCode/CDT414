import java.text.ParseException;


public class Triangle {
	
	public static void main(String[] args) throws ParseException {
		System.out.println("main file was called");
		

	}
	
	public String getType(int i, int j, int k)
	{
		
		if ((i == j && j == k) && isValid(i, j, k)) {
			return "Equilateral";
		} 
		else if ((i == j || j == k) && isValid(i, j, k)) {
			return "Isosceles";
		}
		else if ((i != j && i != k && j != k) && isValid(i, j, k)) {
			return "Scalene";
		}
		else {
			return "Is not a valid triangle";
		}
	}
	
	public boolean isValid(int sideA, int sideB, int sideC){
	    return (sideA>0)&&(sideB>0)&&(sideC>0)&&(sideA+sideB>sideC)&&(sideA+sideC>sideB)&&(sideC+sideB>sideA);
	}
}
