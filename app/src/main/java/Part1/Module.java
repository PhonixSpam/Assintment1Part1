package Assignment1;



import java.util.ArrayList;

public class Module {
	
	private String name;
	private String id;
	private Lecturer lecturer;
	
	private ArrayList<Student> students = new ArrayList<Student>();
	private ArrayList<Course> courses = new ArrayList<Course>();
	
	public Module(String name, String id, Lecturer lecturer) {
		this.name = name;
		this.id = id;
		this.lecturer = lecturer;
	}
	
	public String getName() {
		return name;
	}
	
	public void setName(String moduleName) {
		this.name = moduleName;
	}
	
	public void addStudent(Student student) {
		students.add(student);
		
	}
	
	public void removeStudent(String id) {
		for(int a = 0; a < students.size(); a++) {
			if(students.get(a).getId() == id) {
				students.remove(a);
			}
		}
	}
	
	public ArrayList<Student> getStudents(){
		return students;
	}
	
	public void addCourse(Course course) {
		courses.add(course);
		
	}
	
	public void removeCourse(String id) {
		for(int a = 0; a < courses.size(); a++) {
			if(courses.get(a).getName() == id) {
				courses.remove(a);
			}
		}
	}
	
	public ArrayList<Course> getCourses(){
		return courses;
	}
	
	public Lecturer getLecturer() {
		return lecturer;
	}
	
	public void setLecturer(Lecturer lecturer) {
		this.lecturer = lecturer;
		lecturer.addModule(this, true);
	}
	
	public void setLecturer(Lecturer lecturer, boolean x) {
		this.lecturer = lecturer;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}
}
