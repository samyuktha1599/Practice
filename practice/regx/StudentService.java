package practice.regx;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class StudentService {
	
	public static void main(String[] args) {
		StudentService service=new StudentService();
		 String reg="[A-Za-z]+[./_ ]?[A-Za-z]+[@][0-9[A-Za-z][-#]]+";
			String student="Amit Raj@1PC16C5181-ALU#8";
			Pattern p=Pattern.compile(reg);
			Matcher m=p.matcher(student);
			Student s=service.getStudent(student);
			System.out.println(s);
			System.out.println("Section: "+service.getStudent(s));
	}
	
	public Student getStudent(String student)
	{
		String str[]=student.split("[@-]");
		String st[]=str[2].split("#");
		Student s=new Student();
		s.setName(str[0]);
		s.setUsn(str[1]);
		s.setCollege(st[0]);
		s.setCgpa(st[1]);
		return s;
		
	}
	
	public String getStudent(Student s)
	{
		String usn=s.getUsn();
		int u=Integer.parseInt(usn.substring(7));
		String section;
		if(u>=001 && u<=060)
		{
			section="A";
			return section ;
		}
		if(u>=061 && u<=120)
		{
			section="B";
			return section ;
		}
		if(u>=121 && u<=180)
		{
			section="C";
			return section ;
		}
		if(u>180)
		{
			section="Z";
			return section ;
		}
		
		return null;
	
	}

}
