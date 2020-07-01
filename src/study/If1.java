package study;

import java.util.Scanner;

public class If1 {
	
	
	
	
	//제어문
	//스캐너를 입력 받아서 홀수인지 짝수인지 구하고 
	//4하고 5는 4입니다. 5입니다 라고 출력하시오.
	//만약 숫자가 -이면 마이너스입니다. 출력하시오.
	//숫자가 1자리이면 한자리입니다.
	//숫자가 2자리이면 두자리입니다.
	//숫자가 3자리이면 세자리입니다.
	//라고 출력하세요.
	
	
	
	
	
	
	
	
	
	public void test1() {
		
		Scanner sc = new Scanner(System.in);
		System.out.print("숫자 입력 : ");
		int num = sc.nextInt();
		
		if(num > 0) {
			
			if(num % 2 == 0) {
				System.out.println("짝수입니다.");
				
				if(num == 4) {
					System.out.println("4입니다.");
				}
				
			} else {
				System.out.println("홀수입니다.");
				
				if(num == 5) {
					System.out.println("5입니다.");
				}
				
			}
			
			if( num <= 9 ) {
				System.out.println("한자리입니다.");
			} else if ( num <= 99 ) {
				System.out.println("두자리입니다.");
			} else if ( num <= 999) {
				System.out.println("세자리입니다.");
			}
			
		} else {
			System.out.println("마이너스입니다.");
		}
		

		
	}
	
	
	
	
	
	
	
	
	
	
	//switch문만을 사용하는 문제
	//스캐너로 동물 이름을 입력 받아서 사자면 동물의왕
	//호랑이면 포유류, 개구리면 양서류
	//고양이면 포유류, 고슴도치는 가시맨
	//고릴라면 초식동물을 출력하시오.
	//모기가 나온다면 그건 무시하시오.
	//여기에 없는 동물이 나온다면 미지의동물 이라고 출력
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	public void test2() {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("동물 이름: ");
		
		String str = sc.nextLine();
		
		switch(str) {
		case "사자" : System.out.println("동물의왕");
		break;
		case "호랑이" : System.out.println("포유류");
		break;
		case "개구리" : System.out.println("양서류");
		break;
		case "고양이" : System.out.println("포유류");
		break;
		case "고슴도치" : System.out.println("가시맨");
		break;
		case "고릴라" : System.out.println("초식동물");
		break;
		case "모기" : break;
		default : System.out.println("미지의 동물"); 
		return;
		}
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	//반복문을 사용하여 1부터 100까지 반복문을 돌리고
	//2로 나눠서 나머지가 1인 숫자를 모두 출력 하시오.
	//나머지가 1인 숫자들을 전부 더하시오.
	//전부 더한 값을 10씩 10번 빼시오.
	
	
	
	
	
	
	
	
	
	
	
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
	
	
	
	
	
	
	
	
	   
	
	
	
	
	
	//while문을 사용해서 구구단을 출력하시오.
	//2단부터 19단까지
	//19단 중에 4단은 빼고 출력하시오.
	//19단 중에 결과값이 22하고 63하고 133은 결과값을
	//이십이, 육십삼, 백삼십삼을 출력하시오.
	
	
	
	
	
	
	
	
	
	
	
	
	
	
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
						System.out.println(num + " * " + num2 + " = " + "이십이");
					} else if ( (num * num2) == 63 ){
						System.out.println(num + " * " + num2 + " = " + "육십삼");
					} else if ( (num * num2) == 133 ) {
						System.out.println(num + " * " + num2 + " = " + "백삼십삼");
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
