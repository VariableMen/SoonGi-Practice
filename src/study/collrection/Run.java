package study.collrection;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Scanner;

public class Run {

	
	//�÷��� ����
	//Ű����� ������ �Է� �����ÿ�.
	//ArrayList �ڷᱸ���� ����� ���� ���� ���� �ֵ��� ����ÿ�.
	//�ݺ����� ����Ͽ�  exit�� �Էµɶ����� ��� �Է� �޾Ƽ� ArrayList�� �����ÿ�.
	//exit�� �Է��ϸ� ���ݱ��� �Է¹��� ������ ����Ͻÿ�.
	
	//��� ��:
	//����: 1
	//����: 2
	//����: 7
	//����: 9
	//����: 21
	//����: 65
	//1
	//2
	//7
	//9
	//21
	//65
	// ���� ����Ҷ� ������ ������ �߿����� �ʴ�.
	
	
	//HashSet ����
	//Ű����κ��� ���� �Է� �����ÿ�.
	//HashSet �ڷᱸ���� ����� String ���� �����ÿ�.
	//�ݺ����� ����Ͽ� �̸��� ��� �Է� �ް� HashSet�� ���� �����ÿ�.
	//exit�� �Է��ϸ� �ݺ����� ���߰� HashSet�� �ִ� ���� ��� ����Ͻÿ�.
	//��� ��:
	//�̸�: �̼���
	//�̸�: �庸��
	//�̸�: �����ҹ�
	//�̸�: �峪��
	//�̼���
	//�庸��
	//�����ҹ�
	//�峪��
	//��� ������ �߿����� �ʴ�.
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		ArrayList<Integer> al = new ArrayList<Integer>();
		
		boolean stop = false;
		
		while(!stop) {
			
			System.out.print("����: ");
			
			String num1 = sc.nextLine();
			
			if("exit".equals(num1)) {
				
				stop = true;
				
			} else {
				int su = Integer.parseInt(num1);
				al.add(su);
				
			}
			
		}
		
		for(int i = 0; i < al.size(); i++) {
			System.out.println(al.get(i));
		}
		
		System.out.println();
		
		hashSet();
		
	}

	public static void hashSet() {
		Scanner sc = new Scanner(System.in);
		HashSet<String> hs = new HashSet<String>();
		
		
		while(true) {
			System.out.print("�̸�: ");
			String name = sc.nextLine();
			
			if("exit".equals(name)) {
				
				
				Iterator<String> itera = hs.iterator();
				while(itera.hasNext()) {
					System.out.println(itera.next());
				}
				
				return;
				
			} else {
				hs.add(name);
			}
			
		}
		
	}
	
}
