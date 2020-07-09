package study.object4.view;

import java.util.Scanner;
import study.object4.vo.DunJen;
import study.object4.vo.Player;

public class Menu {
	
	boolean start = true;
	
	public void start() {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("닉네임: ");
		String nickName = sc.nextLine();
		
		do {
			
			System.out.println("================================");
			System.out.println("1.동굴들어가기");
			System.out.println("2.캐릭터 정보");
			System.out.println("3.게임종료");
			System.out.println("================================");
			System.out.print("입력: ");
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
				
				System.out.println( "다시 입력하시오." );
				
			}
			
		} while(start);	
		
	}
	
}
