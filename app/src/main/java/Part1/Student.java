package Assignment1;





import java.util.ArrayList;

import org.joda.time.DateTime;

public class Student {
	private String name;
	private int age;
	private DateTime dob;
	private String id;
	private String user;
	
	private ArrayList<Module> modules = new ArrayList<Module>();
	private ArrayList<Course> courses = new ArrayList<Course>();
	
	public Student(String name, String id, String dob) {
		this.name = name;
		this.dob = DateTime.parse(dob);
		this.id = id;
		this.age = (int) ((DateTime.now().getMillis() - this.dob.getMillis()) / Long.parseLong("31556952000")); //gets the number of mill a seconds in a year to calculate age
	}
	
	public String getName() {
		return name;
	}
	
	public void setName(String name){
		this.name = name;
	}
	
	public int getAge() {
		return age;
	}
	
	public void updateAge() {
		age = (int) ((DateTime.now().getMillis() - this.dob.getMillis()) / Long.parseLong("31556952000"));
	}
	
	public DateTime getDob() {
		return dob;
	}
	
	public void setDob(DateTime dob) {
		this.dob = dob;
	}
	
	public String getUsername() {
		user = name.concat(String.valueOf(age));
		return user;
	}

	public String getId(){
		return id;
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
}
