
public class Lecture {
	
	private String name;
	private Student student;
	
	public Lecture(){
		
	}
	public Lecture(String name){
		this.name = name;
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	public void addStudent(Student student) {
		
		this.student = student;
	}
	public void showStudent() {
		
		System.out.println(student.getName());
	}
}
