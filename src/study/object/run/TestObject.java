package study.object.run;

import java.util.Scanner;

import study.object.vo.Student;

public class TestObject {

	//�л� ������ ��� Student ��� Ŭ������ run�� ���� TestObject Ŭ������ ����ÿ�.
	//�л� ������ [ �̸� , ���� , ����, ��ȭ��ȣ ] �� �޴´�. ( String, int, char, String )
	//Student Ŭ���������� String�� ��ȯ�ϴ� getInfomation �̶�� �޼ҵ带 ����� �л� ������ ��ȯ�Ѵ�.
	//Student�� ĸ��ȭ�� �ؼ� ����ÿ�!
	
	//������ �Է��� ��ĳ�ʸ� ����ؼ� �Է� �޽��ϴ�.
	
	//����� getInfomation�� ����Ѵ�.
	
	//��� ��: �л��� �̸��� ȫ�浿�̰� ���̴� 20�� ������ �� ��ȭ��ȣ�� 010-5555-1111 �Դϴ�.
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	public static void main(String[] args) {
		
		Scanner sc= new Scanner(System.in);
		
		System.out.print("�̸�: ");
		
		String name = sc.nextLine();
		
		System.out.print("����: ");
		
		int age = sc.nextInt();
		
		System.out.print("����: ");
		
		char gender = sc.next().charAt(0);
		sc.nextLine();
		System.out.print("��ȭ��ȣ: ");
		
		String phone = sc.nextLine();
		
		Student st = new Student(name,age,gender,phone);
		
		System.out.println(st.getInfomation());
		
	}

}
