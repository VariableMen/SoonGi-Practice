package study.object.object2.run;

import java.util.Scanner;

import study.object.object2.vo.DongMul;
import study.object.object2.vo.Mammalia;
import study.object.object2.vo.Reptila;

public class Run {

	
	//���� Ŭ������ ������ Ŭ����, ����� Ŭ������ ����� ����� Ŭ������ ����ÿ�.
	//���� Ŭ������ ����� Ŭ����, ������ Ŭ������ ĸ��ȭ�� �Ͻÿ�.
	//������ Ŭ������ ����� Ŭ������ ���� Ŭ������ ��� �����ÿ�.
	//���� Ŭ������ [ �̸�, ����, ����, ����, ������ ]�� �����Ͻÿ�.
	//������ Ŭ������ ����� Ŭ������ String�� ��ȯ�ϴ� getInfomation �޼ҵ带 ����ÿ�.
	
	//�������� ������Ŭ������ �θ��� ������� ����� Ŭ������ �θ��ÿ�.
	//�������� ������� �ƴϸ� "�������� ������� �����ּ���" ��� ��� �Ͻÿ�.
	//������ Ŭ����(Mammalia) ��ü�� �����ϸ� �������Դϴ�.�� ���
	//����� Ŭ����(Reptila) ��ü�� �����ϸ� ������Դϴ�.�� ���
	//�����ʹ� ��ĳ�ʸ� ����ؼ� �Է� �����ÿ�.
	
	//��¿�: �̸�: ���� ����: ������ ����: 2�� ����: ������ ���´� ������: ����
	//��¿�: �̸�: �յ����� ����: ����� ����: ���� ���´� ������: ����
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("�̸�: ");
		String name = sc.nextLine();
		
		System.out.print("����: ");
		String kinds = sc.nextLine();
		
		System.out.print("����: ");
		int age = sc.nextInt();
		
		sc.nextLine();
		
		System.out.print("����: ");
		String breeding = sc.nextLine();
		
		System.out.print("������: ");
		String location = sc.nextLine();
		
		DongMul d = new DongMul();
		
		if( "������".equals(kinds) ) {
			
			Mammalia m = new Mammalia(name, kinds, age, breeding, location);
			
			System.out.println(m.getInfomation());
			
		} else if ( "�����".equals(kinds) ) {
			
			Reptila r = new Reptila(name, kinds, age, breeding, location);
			
			System.out.println(r.getInfomation());
			
		} else {
			
			System.out.println("�������� ������� �����ּ���");
			
		}
		
	}

}
