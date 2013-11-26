
public class Person {
	//Fields
	private String name; 		// Name of the Person
	private int maximumBooks;	// most Books the person can checkout
	
	//Constructors
	public Person() {
		name = "unknown name";
		maximumBooks = 3; 	
	}
	
	// Methods
	public String getName() {
		return name; 
	}
	public void setName(String anyName) {
		name = anyName;
	}

	public int getMaximumBooks() {
		return maximumBooks;
	}

	public void setMaximumBooks(int maximumBooks) {
		this.maximumBooks = maximumBooks;
	}
	
	public String toString(){
		return this.getName() + " (" + this.getMaximumBooks() + " Books)";
	}

}
