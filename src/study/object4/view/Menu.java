package study.object4.view;

import java.util.Scanner;
import study.object4.vo.DunJen;
import study.object4.vo.Player;

public class Menu {
	
	boolean start = true;
	
	public void start() {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("�г���: ");
		String nickName = sc.nextLine();
		
		do {
			
			System.out.println("================================");
			System.out.println("1.��������");
			System.out.println("2.ĳ���� ����");
			System.out.println("3.��������");
			System.out.println("================================");
			System.out.print("�Է�: ");
			String choose = sc.nextLine();
			
			if( "1".equals(choose) || "2".equals(choose) || "3".equals(choose)) {
				
				switch(choose) {
				
				case "1" : 
					DunJen d = new DunJen();
							d.dongGul();
						   break;
				case "2" :
					Player p = new Player();
					p.setName(nickName);
					p.stat();
					break;
				case "3" :
					start = false;
					return;
				}	
				
			} else {
				
				System.out.println( "�ٽ� �Է��Ͻÿ�." );
				
			}
			
		} while(start);	
		
	}
	
}
