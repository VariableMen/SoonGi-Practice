package study.object.vo;

import org.omg.Messaging.SyncScopeHelper;

public class Student {
	
	private String name;
	private int age;
	private char gender;
	private String phone;
	
	public Student() {
		
	}

	public Student(String name, int age, char gender, String phone) {
		super();
		this.name = name;
		this.age = age;
		this.gender = gender;
		this.phone = phone;
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

	public char getGender() {
		return gender;
	}

	public void setGender(char gender) {
		this.gender = gender;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}
	
	public String getInfomation() {
		
		
		return "학생의 이름은 " + name + "이고 " + " 나이는 " + age + "살 " + "성별은 " + gender + " 전화번호는 " + phone + " 입니다.";
		
	}
	
}
