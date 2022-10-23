package Assignment1;



import java.util.ArrayList;

import org.joda.time.DateTime;

public class Course {
	private String name;
	private DateTime courseStart;
	private DateTime courseEnd;
	
	private ArrayList<Student> students = new ArrayList<Student>();
	private ArrayList<Module> modules = new ArrayList<Module>();
	
	public Course(String name, String start, String end) {
		this.setName(name);
		this.setCourseStart(DateTime.parse(start));
		this.setEndDate(DateTime.parse(end));
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public DateTime getCourseStart() {
		return courseStart;
	}

	public void setCourseStart(DateTime courseStart) {
		this.courseStart = courseStart;
	}

	public DateTime getEndDate() {
		return courseEnd;
	}

	public void setEndDate(DateTime courseEnd) {
		this.courseEnd = courseEnd;
	}
	
	public void addModule(Module module) {
		modules.add(module);
		
	}
	
	public void removeModule(String id) {
		for(int a = 0; a < modules.size(); a++) {
			if(modules.get(a).getId() == id) {
				modules.remove(a);
			}
		}
	}
	
	public ArrayList<Module> getModules(){
		return modules;
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
}
