package in.spring.bean;

public class StudentBean {
	private String name;
	private int age;
	private String cource;
	
	public StudentBean() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
	public StudentBean(String name, int age, String cource) {
		super();
		this.name = name;
		this.age = age;
		this.cource = cource;
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
	public String getCource() {
		return cource;
	}
	public void setCource(String cource) {
		this.cource = cource;
	}


	@Override
	public String toString() {
		return "StudentBean [name=" + name + ", age=" + age + ", cource=" + cource + "]";
	}
	
	
	
}
