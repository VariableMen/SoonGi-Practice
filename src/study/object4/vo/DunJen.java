package study.object4.vo;

import java.util.Scanner;

public class DunJen {
	
	public DunJen() {
		
		
		
	}
	
	boolean start = true;
	
	public void dongGul() {
		
		Scanner sc = new Scanner(System.in);
		
		do {
			
			System.out.println("================================");
			System.out.println("1.맞써 싸우기");
			System.out.println("2.동굴에서 나가기");
			System.out.println("================================");
			System.out.print("입력: ");
			String choose = sc.nextLine();
			
			if( "1".equals(choose) || "2".equals(choose) ) {
				
				switch(choose) {
				
				case "1" : 
					int random = (int) (Math.random() * 3) + 1; 
						   if( random == 1 ) {
							   
							   Monster m = new Duck();
							   m.stat();
							   m.attack();
							   m.die();
						   } else if ( random == 2 ) {
							   
							   Monster m2 = new Chicken();
							   m2.stat();
							   m2.attack();
							   m2.die();
						   } else if ( random == 3 ) {
							   
							   Monster m3 = new Lion();
							   m3.stat();
							   m3.attack();
							   m3.die();
						   }
						   break;
				case "2" :
					start = false;
					return;
				}	
				
			} else {
				
				System.out.println( "다시 입력하시오." );
				
			}
			
		} while(start);	
		
	}
	
}
