package study;

import java.util.Scanner;

public class If1 {
	
	
	
	
	//���
	//��ĳ�ʸ� �Է� �޾Ƽ� Ȧ������ ¦������ ���ϰ� 
	//4�ϰ� 5�� 4�Դϴ�. 5�Դϴ� ��� ����Ͻÿ�.
	//���� ���ڰ� -�̸� ���̳ʽ��Դϴ�. ����Ͻÿ�.
	//���ڰ� 1�ڸ��̸� ���ڸ��Դϴ�.
	//���ڰ� 2�ڸ��̸� ���ڸ��Դϴ�.
	//���ڰ� 3�ڸ��̸� ���ڸ��Դϴ�.
	//��� ����ϼ���.
	
	
	
	
	
	
	
	
	
	public void test1() {
		
		Scanner sc = new Scanner(System.in);
		System.out.print("���� �Է� : ");
		int num = sc.nextInt();
		
		if(num > 0) {
			
			if(num % 2 == 0) {
				System.out.println("¦���Դϴ�.");
				
				if(num == 4) {
					System.out.println("4�Դϴ�.");
				}
				
			} else {
				System.out.println("Ȧ���Դϴ�.");
				
				if(num == 5) {
					System.out.println("5�Դϴ�.");
				}
				
			}
			
			if( num <= 9 ) {
				System.out.println("���ڸ��Դϴ�.");
			} else if ( num <= 99 ) {
				System.out.println("���ڸ��Դϴ�.");
			} else if ( num <= 999) {
				System.out.println("���ڸ��Դϴ�.");
			}
			
		} else {
			System.out.println("���̳ʽ��Դϴ�.");
		}
		

		
	}
	
	
	
	
	
	
	
	
	
	
	//switch������ ����ϴ� ����
	//��ĳ�ʷ� ���� �̸��� �Է� �޾Ƽ� ���ڸ� �����ǿ�
	//ȣ���̸� ������, �������� �缭��
	//����̸� ������, ����ġ�� ���ø�
	//����� �ʽĵ����� ����Ͻÿ�.
	//��Ⱑ ���´ٸ� �װ� �����Ͻÿ�.
	//���⿡ ���� ������ ���´ٸ� �����ǵ��� �̶�� ���
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	public void test2() {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("���� �̸�: ");
		
		String str = sc.nextLine();
		
		switch(str) {
		case "����" : System.out.println("�����ǿ�");
		break;
		case "ȣ����" : System.out.println("������");
		break;
		case "������" : System.out.println("�缭��");
		break;
		case "�����" : System.out.println("������");
		break;
		case "����ġ" : System.out.println("���ø�");
		break;
		case "����" : System.out.println("�ʽĵ���");
		break;
		case "���" : break;
		default : System.out.println("������ ����"); 
		return;
		}
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	//�ݺ����� ����Ͽ� 1���� 100���� �ݺ����� ������
	//2�� ������ �������� 1�� ���ڸ� ��� ��� �Ͻÿ�.
	//�������� 1�� ���ڵ��� ���� ���Ͻÿ�.
	//���� ���� ���� 10�� 10�� ���ÿ�.
	
	
	
	
	
	
	
	
	
	
	
	public void test3() {
		
		int sum = 0;
		for(int i = 1; i <= 100; i++) {
			
			if( i % 2 == 1 ) {
				
				sum += i;
				
			}
			
		}
		System.out.println(sum);
		
		for(int q = 1; q <= 10; q++) {
			
			sum -= 10;
			
		}
		System.out.println(sum);
	}
	
	
	
	
	
	
	
	
	   
	
	
	
	
	
	//while���� ����ؼ� �������� ����Ͻÿ�.
	//2�ܺ��� 19�ܱ���
	//19�� �߿� 4���� ���� ����Ͻÿ�.
	//19�� �߿� ������� 22�ϰ� 63�ϰ� 133�� �������
	//�̽���, ���ʻ�, ���ʻ��� ����Ͻÿ�.
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	public void test4() {
		
		int num = 1;
		while(num <= 18) {
			
			num++;
			
			int num2 = 1;
			while(num2 <= 19) {
				
				if(num == 4) {
					
					System.out.print("");
					
				}else {
					
					if((num * num2) == 22) {
						System.out.println(num + " * " + num2 + " = " + "�̽���");
					} else if ( (num * num2) == 63 ){
						System.out.println(num + " * " + num2 + " = " + "���ʻ�");
					} else if ( (num * num2) == 133 ) {
						System.out.println(num + " * " + num2 + " = " + "���ʻ�");
					} else {
						System.out.println(num + " * " + num2 + " = " + (num * num2));
					}
										
				}
				num2++;
			}
			
		}
		
	}
	
	
	
	
	public static void main(String[] args) {
		
		If1 if1 = new If1();
		
//		if1.test1();
//		if1.test2();
//		if1.test3();
		if1.test4();
		
	}

}
