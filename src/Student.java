
public class Student implements Comparable<Student> {
	private String name;
	private int total;
	
	public Student(String name, int total) {
		this.name = name;
		this.total = total;
	}

	@Override
	public int compareTo(Student o) {
//		return this.total - o.total;		// total 기준 
		return this.name.compareTo(o.name);	// name 기준
	}

	@Override
	public String toString() {
		return "Student [name=" + name + ", total=" + total + "]";
	}
	
}
