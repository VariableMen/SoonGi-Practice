package study.object3.view;

import java.util.Scanner;

import study.object3.vo.Chicken;
import study.object3.vo.Duck;
import study.object3.vo.Lion;
import study.object3.vo.Monster;

public class Menu {
	
	boolean start = true;
	
	public void start() {
		
		Scanner sc = new Scanner(System.in);
		
		do {
			
			System.out.println("================================");
			System.out.println("1.���� ����");
			System.out.println("2.���� �����ϱ�");
			System.out.println("================================");
			System.out.print("�Է�: ");
			String choose = sc.nextLine();
			
			if( "1".equals(choose) || "2".equals(choose) ) {
				
				switch(choose) {
				
				case "1" : Monster m = new Duck();
						   Monster m2 = new Chicken();
						   Monster m3 = new Lion();
						   break;
				case "2" :
					start = false;
					return;
				}	
				
			} else {
				
				System.out.println( "�ٽ� �Է��Ͻÿ�." );
				
			}
			
		} while(start);	
		
	}
	
}
