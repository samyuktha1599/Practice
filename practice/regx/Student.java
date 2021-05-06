package practice.regx;

public class Student {
	
	private String name;
	private String usn;
	private String college;
	private String cgpa;
	
	
	public Student() {
		super();
		// TODO Auto-generated constructor stub
	}


	public Student(String name, String usn, String college, String cgpa) {
		super();
		this.name = name;
		this.usn = usn;
		this.college = college;
		this.cgpa = cgpa;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public String getUsn() {
		return usn;
	}


	public void setUsn(String usn) {
		this.usn = usn;
	}


	public String getCollege() {
		return college;
	}


	public void setCollege(String college) {
		this.college = college;
	}


	public String getCgpa() {
		return cgpa;
	}


	public void setCgpa(String cgpa) {
		this.cgpa = cgpa;
	}


	@Override
	public String toString() {
		return "Student [name=" + name + ", usn=" + usn + ", college=" + college + ", cgpa=" + cgpa + "]";
	}
	
	


}
