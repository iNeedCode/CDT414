
public class Triangle {
	
	public static void main(String[] args) {
		System.out.println("main file was called");
		
		Triangle triangle = new Triangle();
		System.out.println(triangle.getType(0, 0, 0));
	}
	
	public String getType(int i, int j, int k)
	{
		return "return from Triangle::getType";
	}
}
