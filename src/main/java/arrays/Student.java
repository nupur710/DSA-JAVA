package arrays;

public class Student implements Cloneable {
	
	String name;
	int id;
	
	public Student(String name, int id) {
		this.name= name;
		this.id= id;
	}
	
	public Object clone() throws CloneNotSupportedException {
		return super.clone();
	}

}
