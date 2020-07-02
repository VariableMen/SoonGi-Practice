package study;

public class Array {

	//배열에 반복문을 사용하여 바나나, 복숭아, 자두, 수박을 넣으시오.
	//바나나를 출력하면 바나나 뒤에 원숭이
	//복숭아를 출력하면 복숭아 뒤에 악어
	//자두를 출력하면 자두 뒤에 고릴라
	//수박을 출력하면 수박 뒤에 오징어를 출력하시오.
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	public void test1() {
		
		String str[] = new String[4];
	
		for(int i = 0; i < str.length; i++) {
			
			if(i == 0) {
				
				str[i] = ("바나나");
				System.out.println(str[i] + "원숭이");
			}
			
			if(i == 1) {
				
				str[i] = ("복숭아");
				System.out.println(str[i] + "악어");
			}
			
			if(i == 2) {
				
				str[i] = ("자두");
				System.out.println(str[i] + "고릴라");
			}
			
			if(i == 3) {
				
				str[i] = ("수박");
				System.out.println(str[i] + "오징어");
			}
			
			
			
			
		}
		
	}
	
	
	
	//2차원 배열을 활용하여 별을 찍자 
	//		*        
	//		* *      
	//		* * *	   
	//      * * * *  
	//	    * * * * * 
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	 
	
	
	
	
	
	
	public void test2() {
		String star[][] = new String[5][9];
		
		for(int i = 0; i < star.length; i++) {
			
			
			
			for(int j = 0; j <= i; j++) {
				
				System.out.print("*");
				
			}
			System.out.println();
		}
		
	}
	
	public static void main(String[] args) {
		Array ar = new Array();
//		ar.test1();
		ar.test2();

	}

}
