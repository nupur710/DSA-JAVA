package arrays;

public class Test {
	
	public static void main(String[] args) {
		Student s1= new Student("nupur", 101);
		Student s2 = null;
		try {

			s2= (Student)s1.clone();
		} catch (CloneNotSupportedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println(s1);
		System.out.println(s2.name);
		System.out.println(s2.id);
	}

}
