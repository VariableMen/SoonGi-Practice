package study.collrection;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Scanner;

public class Run {

	
	//컬렉션 문제
	//키보드로 정수를 입력 받으시오.
	//ArrayList 자료구조를 만들고 정수 값만 들어갈수 있도록 만드시오.
	//반복문을 사용하여  exit가 입력될때까지 계속 입력 받아서 ArrayList에 넣으시오.
	//exit를 입력하면 지금까지 입력받은 정수를 출력하시오.
	
	//출력 예:
	//정수: 1
	//정수: 2
	//정수: 7
	//정수: 9
	//정수: 21
	//정수: 65
	//1
	//2
	//7
	//9
	//21
	//65
	// 값을 출력할때 나오는 순서는 중요하지 않다.
	
	
	//HashSet 문제
	//키보드로부터 값을 입력 받으시오.
	//HashSet 자료구조를 만들고 String 값만 넣으시오.
	//반복문을 사용하여 이름을 계속 입력 받고 HashSet에 값을 넣으시오.
	//exit를 입력하면 반복문을 멈추고 HashSet에 있는 값을 모두 출력하시오.
	//출력 예:
	//이름: 이순신
	//이름: 장보고
	//이름: 연개소문
	//이름: 장나라
	//이순신
	//장보고
	//연개소문
	//장나라
	//출력 순서는 중요하지 않다.
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		ArrayList<Integer> al = new ArrayList<Integer>();
		
		boolean stop = false;
		
		while(!stop) {
			
			System.out.print("정수: ");
			
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
			System.out.print("이름: ");
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
