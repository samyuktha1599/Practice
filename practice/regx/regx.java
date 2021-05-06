package practice.regx;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class regx {
	
	public static void main(String[] args) {
		
		
		
		String reg="[A-Za-z]+[./_ ]?[A-Za-z]+[@][0-9[A-Za-z][-#]]+";
		String s="Amit Raj@1PC16C5046-ALU#8";
		Pattern p=Pattern.compile(reg);
		Matcher m=p.matcher(s);
		System.out.println(m.matches());
		
		String str[]=s.split("[@-]");
		String st[]=str[2].split("#");
		System.out.println("Name:"+str[0]);
		System.out.println("USN:"+str[1]);
		System.out.println("College:"+st[0]);
		System.out.println("Cgpa:"+st[1]);
	}

}
