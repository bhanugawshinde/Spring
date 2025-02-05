package in.spring.bean;

public class StudentBean {
	private String name;
	private int age;
	private String course;
	
	public StudentBean() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
	public StudentBean(String name, int age, String course) {
		super();
		this.name = name;
		this.age = age;
		this.course = course;
	}


	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getCourse() {
		return course;
	}
	public void setCourse(String cource) {
		this.course = cource;
	}


	@Override
	public String toString() {
		return "StudentBean [name=" + name + ", age=" + age + ", cource=" + course + "]";
	}
	
	
	
}
