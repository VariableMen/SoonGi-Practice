package study.object.object2.run;

import java.util.Scanner;

import study.object.object2.vo.DongMul;
import study.object.object2.vo.Mammalia;
import study.object.object2.vo.Reptila;

public class Run {

	
	//동물 클래스와 포유류 클래스, 파충류 클래스를 만들고 실행용 클래스를 만드시오.
	//동물 클래스와 파충류 클래스, 포유류 클래스는 캡슐화를 하시오.
	//포유류 클래스와 파충류 클래스는 동물 클래스를 상속 받으시오.
	//동물 클래스는 [ 이름, 종류, 나이, 번식, 서식지 ]를 정의하시오.
	//포유류 클래스와 파충류 클래스에 String을 반환하는 getInfomation 메소드를 만드시오.
	
	//포유류면 포유류클래스를 부르고 파충류면 파충류 클래스를 부르시오.
	//포유류와 파충류가 아니면 "포유류나 파충류를 적어주세요" 라고 출력 하시오.
	//포유류 클래스(Mammalia) 객체를 생성하면 포유류입니다.를 출력
	//파충류 클래스(Reptila) 객체를 생성하면 파충류입니다.를 출력
	//데이터는 스캐너를 사용해서 입력 받으시오.
	
	//출력예: 이름: 고릴라 종류: 포유류 나이: 2살 번식: 새끼를 낳는다 서식지: 정글
	//출력예: 이름: 왕도마뱀 종류: 파충류 번식: 알을 낳는다 서식지: 정글
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("이름: ");
		String name = sc.nextLine();
		
		System.out.print("종류: ");
		String kinds = sc.nextLine();
		
		System.out.print("나이: ");
		int age = sc.nextInt();
		
		sc.nextLine();
		
		System.out.print("번식: ");
		String breeding = sc.nextLine();
		
		System.out.print("서식지: ");
		String location = sc.nextLine();
		
		DongMul d = new DongMul();
		
		if( "포유류".equals(kinds) ) {
			
			Mammalia m = new Mammalia(name, kinds, age, breeding, location);
			
			System.out.println(m.getInfomation());
			
		} else if ( "파충류".equals(kinds) ) {
			
			Reptila r = new Reptila(name, kinds, age, breeding, location);
			
			System.out.println(r.getInfomation());
			
		} else {
			
			System.out.println("포유류나 파충류를 적어주세요");
			
		}
		
	}

}
