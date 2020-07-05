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
		
		
		return "�л��� �̸��� " + name + "�̰� " + " ���̴� " + age + "�� " + "������ " + gender + " ��ȭ��ȣ�� " + phone + " �Դϴ�.";
		
	}
	
}
